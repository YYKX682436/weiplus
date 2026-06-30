package df2;

/* loaded from: classes3.dex */
public final class nl implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f312397d;

    public nl(df2.pl plVar) {
        this.f312397d = plVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public final void w2(int i17, boolean z17) {
        df2.pl plVar = this.f312397d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(plVar.f312620m, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = plVar.f312623p;
        if (c22613xe7040d9c != null) {
            c22613xe7040d9c.setPadding(0, 0, 0, (i17 < 0 ? 0 : i17) + plVar.O6().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn));
        }
        plVar.G = i17 > 0;
    }
}
