package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes8.dex */
public class w3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f220867d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 f220868e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w33.d f220869f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x3 f220870g;

    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x3 x3Var, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, w33.d dVar) {
        this.f220870g = x3Var;
        this.f220867d = i17;
        this.f220868e = k3Var;
        this.f220869f = dVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$MyChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f220867d;
        w33.d dVar = this.f220869f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = this.f220868e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.x3 x3Var = this.f220870g;
        if (i17 == 4) {
            x3Var.y(true);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w0) k3Var).j(true, dVar.f524247b);
        } else {
            x3Var.y(false);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.w0) k3Var).j(false, dVar.f524247b);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/chatroom/view/MyChatRoomListView$MyChatroomAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
