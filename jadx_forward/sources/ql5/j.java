package ql5;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a f446146d;

    public j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a) {
        this.f446146d = c22702xa9a9ae2a;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f446146d;
        com.p314xaae8f345.mm.ui.yk.a("MicroMsg.PullDownListView", "mThis.getLeft()=%s, mThis.getTop()=%s, mThis.getRight()=%s, mThis.getBottom()=%s", java.lang.Integer.valueOf(c22702xa9a9ae2a.f293697t.getLeft()), java.lang.Integer.valueOf(c22702xa9a9ae2a.f293697t.getTop()), java.lang.Integer.valueOf(c22702xa9a9ae2a.f293697t.getRight()), java.lang.Integer.valueOf(c22702xa9a9ae2a.f293697t.getBottom()));
        c22702xa9a9ae2a.f293700w.set(c22702xa9a9ae2a.f293697t.getLeft(), c22702xa9a9ae2a.f293697t.getTop(), c22702xa9a9ae2a.f293697t.getRight(), c22702xa9a9ae2a.f293697t.getBottom());
    }
}
