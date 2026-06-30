package mx0;

/* loaded from: classes5.dex */
public final class m4 implements uy0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413686a;

    public m4(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        this.f413686a = c10977x8e40eced;
    }

    public boolean a() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413686a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c10977x8e40eced, "<this>");
        by0.c cVar = by0.c.f117856a;
        android.content.Context context = c10977x8e40eced.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.app.Activity a17 = cVar.a(context);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ShootComposing.receiveReeditPostOkSync: activity=");
        sb6.append(a17 != null ? a17.getClass().getName() : null);
        sb6.append(", activityTaskId=");
        sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.getTaskId()) : null);
        sb6.append(", isFinishing=");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.isFinishing()) : null);
        sb6.append(", isDestroyed=");
        sb6.append(a17 != null ? java.lang.Boolean.valueOf(a17.isDestroyed()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
        if (a17 == null || a17.isFinishing() || a17.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "ShootComposing.receiveReeditPostOkSync skip invalid activity");
            return false;
        }
        a17.setResult(-1, new android.content.Intent());
        a17.finish();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "ShootComposing.receiveReeditPostOkSync setResult OK, activity=".concat(a17.getClass().getName()));
        return true;
    }
}
