package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class m7 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f64363d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f64364e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Float f64365f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Float f64366g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f64367h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View.OnTouchListener f64368i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f64369m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.g7 f64370n;

    public m7(androidx.recyclerview.widget.RecyclerView recyclerView, java.util.List items) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(items, "items");
        this.f64363d = recyclerView;
        this.f64364e = items;
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        this.f64365f = valueOf;
        this.f64366g = valueOf;
        this.f64367h = jz5.h.b(new com.tencent.mm.chatroom.ui.h7(this));
        this.f64368i = new com.tencent.mm.chatroom.ui.l7(this);
        this.f64369m = new com.tencent.mm.chatroom.ui.k7(this);
        this.f64370n = new com.tencent.mm.chatroom.ui.g7(this);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f64364e.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01fc A[LOOP:1: B:11:0x01f6->B:13:0x01fc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0484  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r40, int r41) {
        /*
            Method dump skipped, instructions count: 1457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.m7.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.f488396s6, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.chatroom.ui.z7(inflate, this.f64370n, this.f64369m, this.f64368i);
    }
}
