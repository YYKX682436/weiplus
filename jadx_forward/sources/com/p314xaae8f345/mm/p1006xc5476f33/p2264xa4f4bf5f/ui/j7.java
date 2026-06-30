package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class j7 implements l81.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pj4.p1 f255539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 f255540e;

    public j7(pj4.p1 p1Var, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9) {
        this.f255539d = p1Var;
        this.f255540e = activityC18635xb8188ef9;
    }

    @Override // l81.p0
    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject mo12245xcc313de3 = this.f255539d.mo12245xcc313de3();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18635xb8188ef9 activityC18635xb8188ef9 = this.f255540e;
        jSONObject.put(activityC18635xb8188ef9.f255092y, mo12245xcc313de3);
        jSONObject.put(activityC18635xb8188ef9.f255095z, activityC18635xb8188ef9.A);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusDoWhatActivityV2", "initEmojiPanel: configJson：%s", mo12245xcc313de3.toString());
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }
}
