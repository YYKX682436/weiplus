package b04;

/* loaded from: classes4.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.z f16925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b04.z zVar) {
        super(0);
        this.f16925d = zVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Class<?> cls;
        java.lang.String[] stringArrayExtra = this.f16925d.getIntent().getStringArrayExtra("code_item_uic_clz");
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
