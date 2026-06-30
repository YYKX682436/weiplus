package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class z7 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f64712d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f64713e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnTouchListener f64714f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f64715g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f64716h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f64717i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f64718m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f64719n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f64720o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f64721p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(android.view.View itemView, android.view.View.OnClickListener clickListener, android.view.View.OnLongClickListener longClickListener, android.view.View.OnTouchListener touchListener) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(clickListener, "clickListener");
        kotlin.jvm.internal.o.g(longClickListener, "longClickListener");
        kotlin.jvm.internal.o.g(touchListener, "touchListener");
        this.f64712d = clickListener;
        this.f64713e = longClickListener;
        this.f64714f = touchListener;
        this.f64715g = jz5.h.b(new com.tencent.mm.chatroom.ui.p7(itemView));
        this.f64716h = jz5.h.b(new com.tencent.mm.chatroom.ui.y7(itemView));
        this.f64717i = jz5.h.b(new com.tencent.mm.chatroom.ui.q7(itemView));
        this.f64718m = jz5.h.b(new com.tencent.mm.chatroom.ui.n7(itemView));
        this.f64719n = jz5.h.b(new com.tencent.mm.chatroom.ui.o7(itemView));
        jz5.h.b(new com.tencent.mm.chatroom.ui.w7(itemView));
        this.f64720o = jz5.h.b(new com.tencent.mm.chatroom.ui.x7(itemView));
        this.f64721p = jz5.h.b(new com.tencent.mm.chatroom.ui.r7(itemView));
    }

    public static final void i(com.tencent.mm.chatroom.ui.z7 z7Var, android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5) {
        z7Var.getClass();
        com.tencent.mm.storage.a3 W0 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str2);
        if (str4 == null || str4.length() == 0) {
            intent.putExtra("Contact_RoomNickname", W0.z0(str2));
            str4 = W0.z0(str2);
        }
        if (str4 == null || str4.length() == 0) {
            com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(str2);
            str4 = z07 != null ? z07.field_encryptUsername : null;
        }
        if (str4 != null) {
            intent.putExtra("Contact_RemarkName", str4);
        }
        intent.putExtra("key_add_contact_verify_ticket", str5);
        intent.putExtra("Contact_Nick", str3);
        intent.putExtra("Contact_RoomMember", true);
        intent.putExtra("room_name", str);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            com.tencent.mm.autogen.events.SetLocalQQMobileEvent setLocalQQMobileEvent = new com.tencent.mm.autogen.events.SetLocalQQMobileEvent();
            am.au auVar = setLocalQQMobileEvent.f54766g;
            auVar.f6187a = intent;
            auVar.f6188b = str2;
            setLocalQQMobileEvent.e();
        }
        if (n17 != null && n17.k2()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10298, n17.d1() + ",14");
        }
        if (z17) {
            intent.putExtra("Contact_Scene", 96);
        } else {
            intent.putExtra("Contact_Scene", 14);
        }
        intent.putExtra("Is_RoomOwner", true);
        intent.putExtra("Contact_ChatRoomId", str);
        j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
    }

    public final android.widget.Button j() {
        return (android.widget.Button) ((jz5.n) this.f64718m).getValue();
    }

    public final android.widget.TextView k() {
        return (android.widget.TextView) ((jz5.n) this.f64721p).getValue();
    }

    public final java.lang.String l(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                dm.w8 w8Var = new dm.w8();
                w8Var.field_appid = str;
                w8Var.field_wordingId = str2;
                w8Var.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
                if (w8Var.field_wording != null) {
                    java.lang.String str3 = "＠" + w8Var.field_wording;
                    if (str3 != null) {
                        return str3;
                    }
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str2);
                com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                java.lang.String str4 = w8Var.field_language;
                ((za0.k) b0Var).getClass();
                r1Var.g(new l41.z(str, str4, linkedList, 0));
            }
        }
        return "";
    }
}
