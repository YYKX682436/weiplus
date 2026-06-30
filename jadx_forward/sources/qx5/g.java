package qx5;

/* loaded from: classes13.dex */
public class g implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27827x7bb7673e f449024d;

    public g(com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27827x7bb7673e c27827x7bb7673e) {
        this.f449024d = c27827x7bb7673e;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        com.p314xaae8f345.p3210x3857dc.p3212x5b09653.C27827x7bb7673e c27827x7bb7673e = this.f449024d;
        by5.a1.b(c27827x7bb7673e.mo7438x76847179(), "xweb_debug_info", c27827x7bb7673e.f301782e.getText().toString());
        android.widget.Toast.makeText(c27827x7bb7673e.mo7438x76847179(), "已复制到剪贴板", 0).show();
        return true;
    }
}
