package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class a3 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154100d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907) {
        super(false);
        this.f154100d = activityC11351x975a7907;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907.S1;
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907 = this.f154100d;
        activityC11351x975a7907.getClass();
        android.content.Intent intent = new android.content.Intent(activityC11351x975a7907, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11348xdd034dc7.class);
        intent.putExtra("chatroom", activityC11351x975a7907.f154040m);
        intent.putExtra("maxPerAmount", activityC11351x975a7907.W.b());
        intent.putExtra("enter_scene", activityC11351x975a7907.f154057y0);
        java.util.Map map = activityC11351x975a7907.R;
        if (map != null) {
            java.util.HashMap hashMap = (java.util.HashMap) map;
            if (hashMap.size() > 0) {
                java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
                for (java.lang.String str : hashMap.keySet()) {
                    arrayList.add(str + "," + ((java.lang.Double) hashMap.get(str)).doubleValue());
                }
                intent.putStringArrayListExtra("oldAmountData", arrayList);
            }
        }
        if (activityC11351x975a7907.k7() && activityC11351x975a7907.f154058y1.f153950f != null) {
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
            java.util.Iterator it = activityC11351x975a7907.f154058y1.f153950f.iterator();
            while (it.hasNext()) {
                arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.aa.p1007x633fb29.cgi.C11334x8cc8d4b8) it.next()).f153939d);
            }
            intent.putStringArrayListExtra("third_party_usernamelist", arrayList2);
        }
        intent.putExtra("group_solitatire_flag", activityC11351x975a7907.D1);
        if (activityC11351x975a7907.t7()) {
            intent.putStringArrayListExtra("group_solitatire_username_list", activityC11351x975a7907.F1);
            intent.putStringArrayListExtra("group_solitatire_desc_list", activityC11351x975a7907.G1);
        }
        intent.putExtra("maxUserNumber", activityC11351x975a7907.W.a());
        activityC11351x975a7907.startActivityForResult(intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j6.f34370x366c91de);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 3, 2);
    }
}
