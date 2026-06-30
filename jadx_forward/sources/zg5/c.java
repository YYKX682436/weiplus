package zg5;

/* loaded from: classes4.dex */
public class c extends db5.d5 {

    /* renamed from: b, reason: collision with root package name */
    public long f554374b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f554375c;

    public c(android.view.View view) {
        super(view);
        this.f554374b = 3000L;
        this.f554375c = new zg5.b(this);
    }

    public static zg5.c a(android.content.Context context, java.lang.String str, long j17, boolean z17) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d1d, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568890oe3);
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        zg5.c cVar = new zg5.c(inflate);
        cVar.setFocusable(false);
        cVar.setContentView(inflate);
        cVar.setWidth(-1);
        if (z17) {
            cVar.setHeight(-1);
        } else {
            cVar.setHeight(-2);
        }
        cVar.setAnimationStyle(com.p314xaae8f345.mm.R.C30868x68b1db1.f576146rn);
        cVar.f554374b = j17;
        return cVar;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view, int i17, int i18) {
        super.showAsDropDown(view, i17, i18);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f554375c;
        n3Var.mo50303x856b99f0(256);
        n3Var.mo50307xb9e94560(256, this.f554374b);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(android.view.View view, int i17, int i18, int i19) {
        super.showAtLocation(view, i17, i18, i19);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f554375c;
        n3Var.mo50303x856b99f0(256);
        n3Var.mo50307xb9e94560(256, this.f554374b);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(android.view.View view) {
        super.showAsDropDown(view);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f554375c;
        n3Var.mo50303x856b99f0(256);
        n3Var.mo50307xb9e94560(256, this.f554374b);
    }
}
