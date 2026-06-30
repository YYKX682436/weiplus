package zi4;

/* loaded from: classes4.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.n1 f554771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.zb f554772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(zi4.n1 n1Var, bw5.zb zbVar) {
        super(0);
        this.f554771d = n1Var;
        this.f554772e = zbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context;
        java.lang.ref.WeakReference weakReference = this.f554771d.f554714e;
        if (weakReference != null && (context = (android.content.Context) weakReference.get()) != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Native Handle: ");
            bw5.zb zbVar = this.f554772e;
            sb6.append(zbVar != null ? zbVar.f117460e[1] ? zbVar.f117459d : "" : null);
            e4Var.f293309c = sb6.toString();
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
