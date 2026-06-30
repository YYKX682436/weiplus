package pe;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe.e f435122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(pe.e eVar) {
        super(1);
        this.f435122d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        if (!(str == null || str.length() == 0)) {
            java.util.HashMap hashMap = this.f435122d.f435124a;
            java.lang.String a17 = pe.a.f435121a != null ? j62.e.g().a(str, "", true, true) : null;
            hashMap.put(str, a17 != null ? a17 : "");
        }
        return jz5.f0.f384359a;
    }
}
