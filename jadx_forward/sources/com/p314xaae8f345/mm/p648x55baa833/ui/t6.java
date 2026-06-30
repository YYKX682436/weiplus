package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes3.dex */
public final class t6 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f146063d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnTouchListener f146064e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f146065f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f146066g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f146067h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f146068i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f146069m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f146070n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f146071o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f146072p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f146073q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f146074r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f146075s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f146076t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f146077u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 f146078v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10349x67700120 activityC10349x67700120, android.view.View itemView, android.view.View.OnClickListener clickListener, android.view.View.OnLongClickListener onLongClickListener, android.view.View.OnTouchListener touchListener) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchListener, "touchListener");
        this.f146078v = activityC10349x67700120;
        this.f146063d = clickListener;
        this.f146064e = touchListener;
        this.f146065f = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.m6(itemView));
        this.f146066g = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.n6(itemView));
        this.f146067h = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.q6(itemView));
        this.f146068i = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.o6(itemView));
        this.f146069m = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.p6(itemView));
        this.f146070n = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.a6(itemView));
        this.f146071o = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.r6(itemView));
        this.f146072p = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.c6(itemView));
        this.f146073q = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.y5(itemView));
        this.f146074r = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.z5(itemView));
        this.f146075s = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.b6(itemView));
        this.f146076t = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.d6(itemView));
        this.f146077u = jz5.h.b(new com.p314xaae8f345.mm.p648x55baa833.ui.l6(itemView));
    }

    public static final void i(com.p314xaae8f345.mm.p648x55baa833.ui.t6 t6Var, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2) {
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
                arrayList.add(((in.c) it.next()).f374254d);
            }
        } else {
            arrayList = null;
        }
        java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, ",");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplicationByQrOrInvitationUI", "go ToApplicantsList: " + c17);
        intent.putExtra("custom_contact", c17);
        if (linkedList != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                arrayList4.add(((in.c) it6.next()).f374255e);
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
                arrayList5.add(((in.c) it7.next()).f374256f);
            }
            arrayList3 = new java.util.ArrayList<>(arrayList5);
        }
        intent.putStringArrayListExtra("k_avatar_url_list", arrayList3);
        intent.putExtra("chatroomName", str);
        intent.putExtra("intent_key_ticket", str2);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = t6Var.f146078v.mo55332x76847179();
        cVar.d(intent);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.g();
    }

    public final android.widget.Button j() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f146073q).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.Button) mo141623x754a37bb;
    }

    public final android.widget.TextView k() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f146070n).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final android.widget.ImageView l() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f146066g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.ImageView) mo141623x754a37bb;
    }
}
