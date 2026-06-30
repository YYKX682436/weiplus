package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958;

/* loaded from: classes.dex */
public final class q implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 f224912d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1) {
        this.f224912d = activityC16174xab39c6e1;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d data = (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1.f224849z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.ActivityC16174xab39c6e1 activityC16174xab39c6e1 = this.f224912d;
        activityC16174xab39c6e1.getClass();
        if (itemView.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.a) {
            java.lang.Object tag = itemView.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.searchContact.ContactDataItem.ContactViewHolder");
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.a) tag).f224873r != null) {
                java.lang.Object tag2 = itemView.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.plugin.label.ui.searchContact.ContactDataItem.ContactViewHolder");
                android.widget.CheckBox checkBox = ((com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.a) tag2).f224873r;
                if (checkBox != null) {
                    checkBox.setChecked(!checkBox.isChecked());
                }
                if (checkBox.isChecked()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U6 = activityC16174xab39c6e1.U6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
                    java.util.List list = U6.A;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = data.f224887m;
                    list.add(java.lang.String.valueOf(z3Var != null ? z3Var.d1() : null));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U62 = activityC16174xab39c6e1.U6();
                    if (U62 != null && (arrayList2 = U62.B) != null) {
                        arrayList2.add(data);
                    }
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U63 = activityC16174xab39c6e1.U6();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U63);
                    java.util.List list2 = U63.A;
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = data.f224887m;
                    list2.remove(java.lang.String.valueOf(z3Var2 != null ? z3Var2.d1() : null));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1791x872f2958.C16173x548f83b U64 = activityC16174xab39c6e1.U6();
                    if (U64 != null && (arrayList = U64.B) != null) {
                        arrayList.remove(data);
                    }
                }
                activityC16174xab39c6e1.V6();
            }
        }
    }
}
