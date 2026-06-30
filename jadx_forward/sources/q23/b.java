package q23;

/* loaded from: classes10.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 f441342d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 c15628x6bc05830) {
        this.f441342d = c15628x6bc05830;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/livephoto/ui/GalleryLivePhotoTagLayout$initBuildScene$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1719x3d0e40c6.ui.C15628x6bc05830 c15628x6bc05830 = this.f441342d;
        if (c15628x6bc05830.f219943g == null || c15628x6bc05830.f219944h == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryLivePhotoTagLayout", "onClick : " + c15628x6bc05830.hashCode() + ", itemData is invalid");
        }
        if (c15628x6bc05830.f219940d == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryLivePhotoTagLayout", "onClick disabled in SCENE_ALBUM_UI: " + c15628x6bc05830.hashCode());
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick : ");
            sb6.append(c15628x6bc05830.hashCode());
            sb6.append(", mediaId: ");
            sb6.append(c15628x6bc05830.f219944h);
            sb6.append(" state: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d0 = c15628x6bc05830.f219943g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d0);
            sb6.append(c15632xfc4fd0d0.A);
            sb6.append(" currentShowState: ");
            sb6.append(c15628x6bc05830.f219945i);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTagLayout", sb6.toString());
            int i17 = c15628x6bc05830.f219945i;
            p23.a aVar = p23.a.f432959a;
            java.lang.String str3 = "";
            if (i17 == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d02 = c15628x6bc05830.f219943g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d02);
                c15632xfc4fd0d02.A = 2;
                c15628x6bc05830.b(2);
                q23.g gVar = c15628x6bc05830.f219946m;
                if (gVar != null) {
                    ((e33.n2) gVar).a(false);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a();
                am.zi ziVar = c5683x770cde8a.f136009g;
                ziVar.f90100b = false;
                ziVar.f90099a = c15628x6bc05830.f219944h;
                ziVar.f90101c = c15628x6bc05830.f219940d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d03 = c15628x6bc05830.f219943g;
                if (c15632xfc4fd0d03 != null && (str2 = c15632xfc4fd0d03.f219963e) != null) {
                    str3 = str2;
                }
                ziVar.f90102d = str3;
                c5683x770cde8a.e();
                int i18 = c15628x6bc05830.f219940d == 0 ? 1 : 2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d04 = c15628x6bc05830.f219943g;
                aVar.a(i18, 0, c15632xfc4fd0d04 != null ? c15632xfc4fd0d04.B : 0, java.lang.String.valueOf(c15628x6bc05830.f219944h));
            } else if (i17 == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d05 = c15628x6bc05830.f219943g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15632xfc4fd0d05);
                c15632xfc4fd0d05.A = 1;
                c15628x6bc05830.b(1);
                q23.g gVar2 = c15628x6bc05830.f219946m;
                if (gVar2 != null) {
                    ((e33.n2) gVar2).a(true);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a c5683x770cde8a2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5683x770cde8a();
                am.zi ziVar2 = c5683x770cde8a2.f136009g;
                ziVar2.f90100b = true;
                ziVar2.f90099a = c15628x6bc05830.f219944h;
                ziVar2.f90101c = c15628x6bc05830.f219940d;
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d06 = c15628x6bc05830.f219943g;
                if (c15632xfc4fd0d06 != null && (str = c15632xfc4fd0d06.f219963e) != null) {
                    str3 = str;
                }
                ziVar2.f90102d = str3;
                c5683x770cde8a2.e();
                int i19 = c15628x6bc05830.f219940d == 0 ? 1 : 2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d07 = c15628x6bc05830.f219943g;
                aVar.a(i19, 1, c15632xfc4fd0d07 != null ? c15632xfc4fd0d07.B : 0, java.lang.String.valueOf(c15628x6bc05830.f219944h));
                q23.g gVar3 = c15628x6bc05830.f219946m;
                if (gVar3 != null) {
                    e33.n2 n2Var = (e33.n2) gVar3;
                    ((y51.b) n2Var.f328914b).c();
                    n2Var.f328916d.p(n2Var.f328915c, 2);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GalleryLivePhotoTagLayout", c15628x6bc05830.hashCode() + " error state");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15632xfc4fd0d0 c15632xfc4fd0d08 = c15628x6bc05830.f219943g;
        if (c15632xfc4fd0d08 != null && c15632xfc4fd0d08.f219961z == 6 && c15632xfc4fd0d08.A == 1 && c15632xfc4fd0d08.H == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c15632xfc4fd0d08, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.LivePhotoMediaItem");
            if (c15632xfc4fd0d08.I == 0) {
                q23.e eVar = q23.e.f441345a;
                android.content.Context context = c15628x6bc05830.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LIVE_PHOTO_MANUAL_ENABLE_SHOW_INT;
                boolean z17 = c17.r(u3Var, 0) == 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryLivePhotoTeaDialogHelper", "checkShowTeachDialogWhenSelect >> " + z17);
                if (!z17) {
                    gm0.j1.u().c().x(u3Var, 1);
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 0);
                    z2Var.F = new q23.d(z2Var);
                    z2Var.x(1);
                    z2Var.y(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi));
                    z2Var.i(com.p314xaae8f345.mm.R.C30864xbddafb2a.eiw);
                    z2Var.C();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/livephoto/ui/GalleryLivePhotoTagLayout$initBuildScene$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
