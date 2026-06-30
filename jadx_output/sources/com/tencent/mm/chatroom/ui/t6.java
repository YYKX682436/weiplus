package com.tencent.mm.chatroom.ui;

/* loaded from: classes3.dex */
public final class t6 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f64530d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnTouchListener f64531e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f64532f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f64533g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f64534h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f64535i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f64536m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f64537n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f64538o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f64539p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f64540q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f64541r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f64542s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f64543t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f64544u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI f64545v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI roomAccessVerifyApplicationByQrOrInvitationUI, android.view.View itemView, android.view.View.OnClickListener clickListener, android.view.View.OnLongClickListener onLongClickListener, android.view.View.OnTouchListener touchListener) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        kotlin.jvm.internal.o.g(touchListener, "touchListener");
        this.f64545v = roomAccessVerifyApplicationByQrOrInvitationUI;
        this.f64530d = clickListener;
        this.f64531e = touchListener;
        this.f64532f = jz5.h.b(new com.tencent.mm.chatroom.ui.m6(itemView));
        this.f64533g = jz5.h.b(new com.tencent.mm.chatroom.ui.n6(itemView));
        this.f64534h = jz5.h.b(new com.tencent.mm.chatroom.ui.q6(itemView));
        this.f64535i = jz5.h.b(new com.tencent.mm.chatroom.ui.o6(itemView));
        this.f64536m = jz5.h.b(new com.tencent.mm.chatroom.ui.p6(itemView));
        this.f64537n = jz5.h.b(new com.tencent.mm.chatroom.ui.a6(itemView));
        this.f64538o = jz5.h.b(new com.tencent.mm.chatroom.ui.r6(itemView));
        this.f64539p = jz5.h.b(new com.tencent.mm.chatroom.ui.c6(itemView));
        this.f64540q = jz5.h.b(new com.tencent.mm.chatroom.ui.y5(itemView));
        this.f64541r = jz5.h.b(new com.tencent.mm.chatroom.ui.z5(itemView));
        this.f64542s = jz5.h.b(new com.tencent.mm.chatroom.ui.b6(itemView));
        this.f64543t = jz5.h.b(new com.tencent.mm.chatroom.ui.d6(itemView));
        this.f64544u = jz5.h.b(new com.tencent.mm.chatroom.ui.l6(itemView));
    }

    public static final void i(com.tencent.mm.chatroom.ui.t6 t6Var, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2) {
        java.util.ArrayList arrayList;
        java.util.ArrayList<java.lang.String> arrayList2;
        t6Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        pf5.j0.a(intent, cj5.l2.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, dj5.b.class);
        pf5.j0.a(intent, un.w.class);
        java.util.ArrayList<java.lang.String> arrayList3 = null;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((in.c) it.next()).f292721d);
            }
        } else {
            arrayList = null;
        }
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(arrayList, ",");
        com.tencent.mars.xlog.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "go ToApplicantsList: " + c17);
        intent.putExtra("custom_contact", c17);
        if (linkedList != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                arrayList4.add(((in.c) it6.next()).f292722e);
            }
            arrayList2 = new java.util.ArrayList<>(arrayList4);
        } else {
            arrayList2 = null;
        }
        intent.putStringArrayListExtra("k_nick_name_list", arrayList2);
        if (linkedList != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it7 = linkedList.iterator();
            while (it7.hasNext()) {
                arrayList5.add(((in.c) it7.next()).f292723f);
            }
            arrayList3 = new java.util.ArrayList<>(arrayList5);
        }
        intent.putStringArrayListExtra("k_avatar_url_list", arrayList3);
        intent.putExtra("chatroomName", str);
        intent.putExtra("intent_key_ticket", str2);
        bh5.c cVar = new bh5.c();
        cVar.f20922a.f20924a = t6Var.f64545v.getContext();
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.g();
    }

    public final android.widget.Button j() {
        java.lang.Object value = ((jz5.n) this.f64540q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.Button) value;
    }

    public final android.widget.TextView k() {
        java.lang.Object value = ((jz5.n) this.f64537n).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.ImageView l() {
        java.lang.Object value = ((jz5.n) this.f64533g).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.ImageView) value;
    }
}
