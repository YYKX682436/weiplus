package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* loaded from: classes10.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i f294000a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f294001b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f294002c;

    /* renamed from: d, reason: collision with root package name */
    public int f294003d = 3500;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f294004e;

    public f(android.app.Activity activity) {
        this.f294001b = activity.getApplicationContext();
        this.f294000a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i(activity, 0);
    }

    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22720x4c5182e c22720x4c5182e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22720x4c5182e(this.f294002c, null, 0, null, this.f294003d, this.f294001b.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq), 0, this.f294004e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i iVar = this.f294000a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.C22721xaf9ba7f3 c22721xaf9ba7f3 = iVar.f294005a;
        if (c22721xaf9ba7f3 != null) {
            android.view.View view = iVar.f294006b;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar = iVar.f294007c;
            if (view.getParent() != null && view.getParent() != c22721xaf9ba7f3) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n nVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.n(c22720x4c5182e, view, hVar, null);
            java.util.LinkedList linkedList = (java.util.LinkedList) c22721xaf9ba7f3.f293992d;
            linkedList.offer(nVar);
            if (linkedList.size() == 1) {
                c22721xaf9ba7f3.b(nVar, false);
            }
        }
        return iVar;
    }

    public f(android.content.Context context, android.view.View view) {
        this.f294001b = context;
        this.f294000a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.i(context, view, 0);
    }
}
