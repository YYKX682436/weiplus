package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes3.dex */
public class th implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f287135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287136e;

    public th(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, java.lang.String str) {
        this.f287136e = c21908xb66fd105;
        this.f287135d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f287135d);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287136e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.h(intent, c21908xb66fd105.f284708s.x());
        j45.l.j(c21908xb66fd105.f284708s.g(), "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
