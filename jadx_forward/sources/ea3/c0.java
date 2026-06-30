package ea3;

/* loaded from: classes10.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16229xb4df5d31 f332140d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16229xb4df5d31 c16229xb4df5d31) {
        this.f332140d = c16229xb4df5d31;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppLivePhotoTagLayout$setTagClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1809x62f6fe4.p1810x5897e6f.C16229xb4df5d31 c16229xb4df5d31 = this.f332140d;
        if (c16229xb4df5d31.f225671i == null || c16229xb4df5d31.f225672m == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppLivePhotoTagLayout", "onClick : " + c16229xb4df5d31.hashCode() + ", itemData is invalid");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick : ");
        sb6.append(c16229xb4df5d31.hashCode());
        sb6.append(", mediaId: ");
        sb6.append(c16229xb4df5d31.f225672m);
        sb6.append(" state: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = c16229xb4df5d31.f225671i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d0);
        sb6.append(c15632xfc4fd0d0.A);
        sb6.append(" currentShowState: ");
        sb6.append(c16229xb4df5d31.f225673n);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppLivePhotoTagLayout", sb6.toString());
        int i17 = c16229xb4df5d31.f225673n;
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d02 = c16229xb4df5d31.f225671i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d02);
            c15632xfc4fd0d02.A = 2;
            c16229xb4df5d31.a(2);
            ea3.d0 d0Var = c16229xb4df5d31.f225674o;
            if (d0Var != null) {
                ((ea3.c) d0Var).a(false);
            }
        } else if (i17 == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d03 = c16229xb4df5d31.f225671i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d03);
            c15632xfc4fd0d03.A = 1;
            c16229xb4df5d31.a(1);
            ea3.d0 d0Var2 = c16229xb4df5d31.f225674o;
            if (d0Var2 != null) {
                ((ea3.c) d0Var2).a(true);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppLivePhotoTagLayout", c16229xb4df5d31.hashCode() + " error state");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppLivePhotoTagLayout$setTagClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
