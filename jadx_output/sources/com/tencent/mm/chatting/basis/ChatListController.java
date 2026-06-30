package com.tencent.mm.chatting.basis;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003J*\u0010\u000b\u001a\u00020\u00052\"\u0010\n\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b0\u0007J\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00020\fH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/tencent/mm/chatting/basis/ChatListController;", "DataType", "Lin5/s;", "", "msgItemData", "Ljz5/f0;", "bindMsg", "Ljava/lang/Class;", "Lxn/b;", "Lxn/c;", "clazz", "bindItemTypeHelper", "", "type", "getItemConvert", "Landroidx/appcompat/app/AppCompatActivity;", "context", "Landroidx/appcompat/app/AppCompatActivity;", "getContext", "()Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lxn/d;", "mvvmList", "Lcom/tencent/mm/plugin/mvvmlist/MvvmList;", "Lxm3/t0;", "mvvmRecyclerAdapter", "Lxm3/t0;", "config", "Lxn/b;", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/recyclerview/widget/RecyclerView;)V", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ChatListController<DataType> implements in5.s {
    private xn.b config;
    private final androidx.appcompat.app.AppCompatActivity context;
    private com.tencent.mm.plugin.mvvmlist.MvvmList<xn.d> mvvmList;
    private xm3.t0 mvvmRecyclerAdapter;
    private final androidx.recyclerview.widget.RecyclerView recyclerView;

    public ChatListController(androidx.appcompat.app.AppCompatActivity context, androidx.recyclerview.widget.RecyclerView recyclerView) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        this.context = context;
        this.recyclerView = recyclerView;
        recyclerView.setLayoutManager(new com.tencent.mm.view.recyclerview.WxLinearLayoutManager(context));
        com.tencent.mm.plugin.mvvmlist.MvvmList<xn.d> mvvmList = new com.tencent.mm.plugin.mvvmlist.MvvmList<>(new ym3.e(), new xm3.n0(), context, null, null, 24, null);
        xm3.t0 t0Var = new xm3.t0(mvvmList, this, false);
        this.mvvmRecyclerAdapter = t0Var;
        recyclerView.setAdapter(t0Var);
        this.mvvmList = mvvmList;
    }

    public final void bindItemTypeHelper(java.lang.Class<? extends xn.b> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        xn.b newInstance = clazz.newInstance();
        kotlin.jvm.internal.o.f(newInstance, "newInstance(...)");
        this.config = newInstance;
    }

    public final void bindMsg(java.util.List<? extends DataType> msgItemData) {
        kotlin.jvm.internal.o.g(msgItemData, "msgItemData");
        com.tencent.mm.plugin.mvvmlist.MvvmList<xn.d> mvvmList = this.mvvmList;
        if (mvvmList != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(msgItemData, 10));
            int i17 = 0;
            for (java.lang.Object obj : msgItemData) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                xn.b bVar = this.config;
                if (bVar == null) {
                    kotlin.jvm.internal.o.o("config");
                    throw null;
                }
                arrayList.add(new xn.d(i17, obj, bVar));
                i17 = i18;
            }
            com.tencent.mm.plugin.mvvmlist.MvvmList.w(mvvmList, arrayList, false, 2, null);
        }
    }

    public final androidx.appcompat.app.AppCompatActivity getContext() {
        return this.context;
    }

    public final androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    @Override // in5.s
    public xn.c getItemConvert(int type) {
        xn.b bVar = this.config;
        if (bVar == null) {
            kotlin.jvm.internal.o.o("config");
            throw null;
        }
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) bVar.f455402a;
        java.lang.Class cls = (java.lang.Class) linkedHashMap.get(java.lang.Integer.valueOf(type));
        if (cls == null) {
            java.lang.Object obj = linkedHashMap.get(java.lang.Integer.valueOf(("_1_0").hashCode()));
            kotlin.jvm.internal.o.d(obj);
            cls = (java.lang.Class) obj;
        }
        return (xn.c) cls.newInstance();
    }
}
