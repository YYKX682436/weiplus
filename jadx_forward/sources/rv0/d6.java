package rv0;

/* loaded from: classes5.dex */
public final class d6 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481509d;

    public d6(rv0.z6 z6Var) {
        this.f481509d = z6Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78 = (com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78) obj;
        if (c3971x241f78 == null) {
            return;
        }
        rv0.z6 z6Var = this.f481509d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = z6Var.p7().getLayoutManager();
        if ((layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null) != null) {
            z6Var.p7().post(new rv0.c6(z6Var, c3971x241f78));
        }
    }
}
