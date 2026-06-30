package wn;

/* loaded from: classes10.dex */
public abstract class a extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f528901d;

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        yz5.a aVar;
        if (!z(str, w0Var) || (aVar = this.f528901d) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }

    public abstract java.util.List x();

    public abstract void y(boolean z17, java.util.List list);

    public abstract boolean z(java.lang.String str, l75.w0 w0Var);
}
