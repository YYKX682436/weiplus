package df;

/* loaded from: classes15.dex */
public final class a implements io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df.d f310953a;

    public a(df.d dVar) {
        this.f310953a = dVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e
    /* renamed from: hideKeyboard */
    public boolean mo65918x3f895349() {
        df.d dVar = this.f310953a;
        if (dVar == null) {
            return false;
        }
        dVar.mo124131x3f895349();
        return false;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.InterfaceC28702x2a2b165e
    /* renamed from: showKeyboard */
    public boolean mo65919xeb3e6604(android.view.View view, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28675xdb64c7c6.WxInputConfiguration wxInputConfiguration) {
        df.d dVar = this.f310953a;
        if (dVar == null) {
            return true;
        }
        dVar.mo124132xeb3e6604(view, wxInputConfiguration);
        return true;
    }
}
