package ql5;

/* loaded from: classes3.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f446144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a f446145e;

    public i(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a, android.view.View view) {
        this.f446145e = c22702xa9a9ae2a;
        this.f446144d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = this.f446145e;
        if (c22702xa9a9ae2a.f293699v != null) {
            c22702xa9a9ae2a.f293691p = -r1.getWidth();
            c22702xa9a9ae2a.f293694q = c22702xa9a9ae2a.f293699v.getHeight();
            android.view.View view = c22702xa9a9ae2a.f293699v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/listview/PullDownListView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/listview/PullDownListView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f446144d.bringToFront();
    }
}
