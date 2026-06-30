package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f218761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f218762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 f218763f;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 c15530x17431dc6, boolean z17, org.json.JSONObject jSONObject) {
        this.f218763f = c15530x17431dc6;
        this.f218761d = z17;
        this.f218762e = jSONObject;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/flash/FaceFlashProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f218761d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.C15530x17431dc6 c15530x17431dc6 = this.f218763f;
        if (z17) {
            c15530x17431dc6.f218574d.Y6();
        } else {
            c15530x17431dc6.f218574d.U6(this.f218762e);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/flash/FaceFlashProcessLayout$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
