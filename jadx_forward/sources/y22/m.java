package y22;

/* loaded from: classes10.dex */
public final class m implements y22.h {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f540636a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 f540637b;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4) {
        this.f540637b = activityC13388xb8f672d4;
    }

    public void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f540636a;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540637b.f180139d, "dismissLoading: " + this.f540636a);
    }

    public void c(boolean z17, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4 = this.f540637b;
        if (z17) {
            intent.putExtra("key_enter_time", activityC13388xb8f672d4.f180145m);
            intent.putExtra("gif_md5", str);
            activityC13388xb8f672d4.setResult(-1, intent);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d8141 = activityC13388xb8f672d4.f180150r;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141 c13384x547d81412 = activityC13388xb8f672d4.f180150r;
            long j17 = c13384x547d81412.f180116d;
            c13384x547d8141.f180125p = currentTimeMillis - j17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.api.C13384x547d8141.b(6, j17, c13384x547d81412.f180125p, 0L, 0L, 0L, 0L, 0, 0, c13384x547d81412.G);
            activityC13388xb8f672d4.setResult(0);
        }
        activityC13388xb8f672d4.finish();
    }

    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.ActivityC13388xb8f672d4 activityC13388xb8f672d4 = this.f540637b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC13388xb8f672d4.f180139d, "go2Capture");
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb = activityC13388xb8f672d4.f180140e;
        if (c13392x8bacb7fb != null) {
            c13392x8bacb7fb.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1381xb20c216d.C13397xbda8fd8e c13397xbda8fd8e = activityC13388xb8f672d4.f180141f;
        if (c13397xbda8fd8e != null) {
            c13397xbda8fd8e.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13392x8bacb7fb c13392x8bacb7fb2 = activityC13388xb8f672d4.f180140e;
        if (c13392x8bacb7fb2 != null) {
            c13392x8bacb7fb2.c();
        }
        activityC13388xb8f672d4.f180144i = 0;
    }

    public void e(java.lang.String str) {
        r22.c cVar = this.f540637b.f180143h;
        if (cVar != null) {
            w22.v vVar = (w22.v) cVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", "voice text callback");
            vVar.c(str, new w22.p(vVar, str));
        }
    }

    public void f(android.content.Context context, java.lang.CharSequence msg, boolean z17, int i17, android.content.DialogInterface.OnCancelListener onCancelListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        pm0.v.X(new y22.l(this, context, msg, z17, i17, onCancelListener));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f540637b.f180139d, "showLoading: " + this.f540636a);
    }
}
