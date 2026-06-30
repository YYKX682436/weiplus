package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public class za extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f64724d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f64725e;

    /* renamed from: f, reason: collision with root package name */
    public final o11.g f64726f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI f64727g;

    public za(com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI, android.content.Context context) {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        this.f64727g = seeAccessVerifyInfoUI;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f64724d = arrayList;
        java.lang.String[] strArr3 = null;
        this.f64726f = null;
        this.f64725e = context;
        if (com.tencent.mm.sdk.platformtools.t8.K0(seeAccessVerifyInfoUI.f63911g)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesUsernames null");
        } else {
            java.lang.String[] split = seeAccessVerifyInfoUI.f63911g.split(",");
            if (com.tencent.mm.sdk.platformtools.t8.K0(seeAccessVerifyInfoUI.f63910f)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesNicknames null");
            } else {
                java.lang.String[] split2 = seeAccessVerifyInfoUI.f63910f.split(",");
                if (com.tencent.mm.sdk.platformtools.t8.K0(seeAccessVerifyInfoUI.f63913i)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesAppids null");
                    strArr = null;
                } else {
                    strArr = seeAccessVerifyInfoUI.f63913i.split(",");
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(seeAccessVerifyInfoUI.f63912h)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesDescids null");
                    strArr2 = null;
                } else {
                    strArr2 = seeAccessVerifyInfoUI.f63912h.split(",");
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(seeAccessVerifyInfoUI.f63914m)) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesHeadimgurls null");
                } else {
                    strArr3 = seeAccessVerifyInfoUI.f63914m.split(",");
                }
                arrayList.clear();
                int i17 = 0;
                while (i17 < split.length) {
                    com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI2 = this.f64727g;
                    java.lang.String str = split[i17];
                    java.lang.String str2 = (split2.length <= i17 || com.tencent.mm.sdk.platformtools.t8.K0(split2[i17])) ? split[i17] : split2[i17];
                    java.lang.String str3 = "";
                    java.lang.String str4 = (strArr == null || strArr.length <= i17 || com.tencent.mm.sdk.platformtools.t8.K0(strArr[i17])) ? "" : strArr[i17];
                    java.lang.String str5 = (strArr2 == null || strArr2.length <= i17 || com.tencent.mm.sdk.platformtools.t8.K0(strArr2[i17])) ? "" : strArr2[i17];
                    if (strArr3 != null && strArr3.length > i17 && !com.tencent.mm.sdk.platformtools.t8.K0(strArr3[i17])) {
                        str3 = strArr3[i17];
                    }
                    arrayList.add(new com.tencent.mm.chatroom.ui.xa(seeAccessVerifyInfoUI2, str, str2, str4, str5, str3));
                    i17++;
                }
            }
        }
        o11.f fVar = new o11.f();
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
        this.f64726f = fVar.a();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f64724d).size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return ((java.util.ArrayList) this.f64724d).get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.tencent.mm.chatroom.ui.ab abVar;
        android.content.Context context = this.f64725e;
        com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = this.f64727g;
        if (view == null) {
            view = android.view.View.inflate(context, com.tencent.mm.R.layout.chc, null);
            abVar = seeAccessVerifyInfoUI.U6(view);
        } else {
            abVar = (com.tencent.mm.chatroom.ui.ab) view.getTag();
            if (abVar == null) {
                abVar = seeAccessVerifyInfoUI.U6(view);
            }
        }
        abVar.f64038a.setVisibility(0);
        abVar.f64039b.setVisibility(0);
        n11.a b17 = n11.a.b();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f64724d;
        b17.h(((com.tencent.mm.chatroom.ui.xa) arrayList.get(i17)).f64668e, abVar.f64038a, this.f64726f);
        android.widget.TextView textView = abVar.f64039b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = ((com.tencent.mm.chatroom.ui.xa) arrayList.get(i17)).f64665b;
        if (str == null) {
            str = "";
        }
        float textSize = abVar.f64039b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        if (com.tencent.mm.storage.z3.m4(((com.tencent.mm.chatroom.ui.xa) arrayList.get(i17)).f64664a)) {
            seeAccessVerifyInfoUI.F = true;
            dm.w8 w8Var = new dm.w8();
            java.lang.String str2 = ((com.tencent.mm.chatroom.ui.xa) arrayList.get(i17)).f64667d;
            if (str2 == null) {
                str2 = "";
            }
            w8Var.field_appid = str2;
            java.lang.String str3 = ((com.tencent.mm.chatroom.ui.xa) arrayList.get(i17)).f64666c;
            w8Var.field_wordingId = str3 != null ? str3 : "";
            w8Var.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
            if (android.text.TextUtils.isEmpty(w8Var.field_wording)) {
                if (!com.tencent.mm.sdk.platformtools.t8.K0(w8Var.field_appid) && !com.tencent.mm.sdk.platformtools.t8.K0(w8Var.field_wordingId)) {
                    java.util.LinkedList linkedList = new java.util.LinkedList();
                    linkedList.add(w8Var.field_wordingId);
                    if (!com.tencent.mm.sdk.platformtools.t8.C0(abVar.f64040c.getTag(), "first")) {
                        seeAccessVerifyInfoUI.G = true;
                        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                        ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                        java.lang.String str4 = w8Var.field_appid;
                        java.lang.String str5 = w8Var.field_language;
                        ((za0.k) b0Var).getClass();
                        r1Var.g(new l41.z(str4, str5, linkedList, 0));
                    }
                }
                abVar.f64040c.setVisibility(4);
                abVar.f64040c.setTag("first");
            } else {
                abVar.f64040c.setVisibility(0);
                abVar.f64040c.setText("＠" + w8Var.field_wording);
            }
        } else {
            abVar.f64040c.setVisibility(8);
        }
        view.setOnClickListener(new com.tencent.mm.chatroom.ui.ya(this, i17));
        return view;
    }
}
