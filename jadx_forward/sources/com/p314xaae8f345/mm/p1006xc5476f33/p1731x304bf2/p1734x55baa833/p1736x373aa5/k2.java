package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 f220734d;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70) {
        this.f220734d = c15854x49003e70;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = this.f220734d;
        if (c15854x49003e70.D != null) {
            java.lang.String obj = c15854x49003e70.f220477n.getText().toString();
            if (c15854x49003e70.f220474h.getVisibility() == 0 && (c15854x49003e70.f220474h.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3)) {
                i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3) c15854x49003e70.f220474h.getTag()).f36470x8cea31d7;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15716x8f4414e3 c15716x8f4414e3 = c15854x49003e70.f220472J;
                i17 = c15716x8f4414e3 != null ? c15716x8f4414e3.f36470x8cea31d7 : 0;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.q2 q2Var = c15854x49003e70.D;
            c15854x49003e70.getClass();
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str : obj.split("@")) {
                int indexOf = str.indexOf(8197);
                if (indexOf > 0) {
                    java.lang.String substring = str.substring(0, indexOf);
                    java.util.Iterator it = ((java.util.HashMap) c15854x49003e70.E).entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            java.lang.String str2 = (java.lang.String) entry.getKey();
                            if (((java.util.List) entry.getValue()).contains(substring)) {
                                hashSet.add(str2);
                                break;
                            }
                        }
                    }
                }
            }
            q2Var.a(obj, new java.util.LinkedList(hashSet), i17);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/GameChatCommentFooter$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
