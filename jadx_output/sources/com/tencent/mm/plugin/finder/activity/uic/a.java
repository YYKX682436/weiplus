package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public class a extends x92.e {
    public java.lang.String B;
    public long C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public org.json.JSONObject G;
    public r45.qt2 H;
    public final int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.B = "";
        this.C = c01.id.c();
        this.D = xy2.c.e(activity) + '-' + this.C;
        this.E = "";
        this.F = "";
        this.G = new org.json.JSONObject();
        this.I = -1;
    }

    @Override // x92.e, x92.r
    public void R6() {
        super.R6();
        android.widget.LinearLayout linearLayout = this.f452678n;
        if (linearLayout != null) {
            s92.g.d(s92.g.f405006a, getActivity(), linearLayout, "activity_more", 0, 8, null);
        }
    }

    @Override // x92.r
    public void S6(com.tencent.mm.protobuf.f fVar) {
        r45.e21 e21Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        r45.r03 r03Var = (r45.r03) fVar;
        super.S6(r03Var);
        java.lang.String username = (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null) ? null : finderContact.getUsername();
        if (username == null) {
            username = "";
        }
        this.B = username;
    }

    @Override // x92.e
    public v92.g X6() {
        return new aa2.j((r45.r03) this.f452719d, getActivity());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        r45.e21 e21Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.String string = (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null) ? null : e21Var.getString(2);
        return string == null ? "" : string;
    }

    @Override // x92.e, x92.r, com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("start_time", -1L);
        java.lang.String stringExtra = getIntent().getStringExtra("vst_id");
        if (longExtra > 0) {
            if (stringExtra == null || stringExtra.length() == 0) {
                return;
            }
            this.C = longExtra;
            this.D = stringExtra;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        this.H = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        this.F = pm0.v.u(getIntent().getLongExtra("key_feed_report_id", -1L));
        java.lang.String stringExtra = getIntent().getStringExtra("key_activity_profile_src_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.E = stringExtra;
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_extra_report_info");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        int intExtra = getIntent().getIntExtra("key_enter_scene", 0);
        java.lang.String stringExtra3 = getIntent().getStringExtra("key_extra_info");
        java.lang.String str = stringExtra3 != null ? stringExtra3 : "";
        if (kotlin.jvm.internal.o.b(this.E, "1")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("feedid", this.F));
        } else if (kotlin.jvm.internal.o.b(this.E, "2")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("finderusername", this.B));
        } else {
            this.G.put("src_type", this.E).put("vst_id", this.D);
        }
        if (intExtra == 15) {
            this.G = new org.json.JSONObject(stringExtra2);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        org.json.JSONObject jSONObject = ((com.tencent.mm.plugin.finder.activity.uic.o) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.activity.uic.o.class)).X;
        if (jSONObject != null) {
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                this.G.put(next, jSONObject.opt(next));
            }
        }
        int i17 = this.I;
        if (i17 != -1) {
            this.G.put("activity_entry_type", i17);
        }
        com.tencent.mm.plugin.finder.report.d3 d3Var = com.tencent.mm.plugin.finder.report.d3.f124995a;
        d3Var.a(getContext(), this.G, true, 0L, this.C, this.H, str);
        this.G = new org.json.JSONObject();
        if (kotlin.jvm.internal.o.b(this.E, "1")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("feedid", this.F));
        } else if (kotlin.jvm.internal.o.b(this.E, "2")) {
            this.G.put("src_type", this.E).put("vst_id", this.D).put("src_ext_info", new org.json.JSONObject().put("finderusername", this.B));
        } else {
            this.G.put("src_type", this.E).put("vst_id", this.D);
        }
        if (intExtra == 15) {
            this.G = new org.json.JSONObject(stringExtra2);
        }
        if (i17 != -1) {
            this.G.put("activity_entry_type", i17);
        }
        d3Var.a(getContext(), this.G, false, c01.id.c() - this.C, -1L, this.H, str);
    }
}
