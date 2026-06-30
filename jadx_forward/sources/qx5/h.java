package qx5;

/* loaded from: classes13.dex */
public class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27828xb1690eb4 f449026d;

    public h(com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27828xb1690eb4 c27828xb1690eb4) {
        this.f449026d = c27828xb1690eb4;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27828xb1690eb4 c27828xb1690eb4 = this.f449026d;
        by5.a1.b(c27828xb1690eb4.mo7438x76847179(), "xweb_debug_info", c27828xb1690eb4.f301783d.getText().toString());
        android.widget.Toast.makeText(c27828xb1690eb4.mo7438x76847179(), "已复制到剪贴板", 0).show();
        return true;
    }
}
