package b04;

/* loaded from: classes4.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.z f98458d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b04.z zVar) {
        super(0);
        this.f98458d = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Class<?> cls;
        java.lang.String[] stringArrayExtra = this.f98458d.m158359x1e885992().getStringArrayExtra("code_item_uic_clz");
        if (stringArrayExtra == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : stringArrayExtra) {
            try {
                cls = java.lang.Class.forName(str);
            } catch (java.lang.Throwable unused) {
                cls = null;
            }
            if (cls != null) {
                arrayList.add(cls);
            }
        }
        return arrayList;
    }
}
