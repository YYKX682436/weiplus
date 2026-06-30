package lp4;

/* loaded from: classes10.dex */
public final class n0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f401914d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h70 f401915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lp4.q0 f401916f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f401917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(yz5.l lVar, r45.h70 h70Var, lp4.q0 q0Var, android.graphics.Rect rect) {
        super(1);
        this.f401914d = lVar;
        this.f401915e = h70Var;
        this.f401916f = q0Var;
        this.f401917g = rect;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16995x8ab634cd c16995x8ab634cd3;
        android.os.Bundle bundle;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int i17 = 0;
        this.f401914d.mo146xb9724478(java.lang.Boolean.valueOf(bitmap != null));
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineEditorRemuxPlugin", "saveThumbBitmap error");
        } else {
            r45.h70 h70Var = this.f401915e;
            java.util.LinkedList<r45.ho6> tracks = h70Var.f457430d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tracks, "tracks");
            long j17 = 0;
            long j18 = 0;
            for (r45.ho6 ho6Var : tracks) {
                int i18 = ho6Var.f457867e;
                if (i18 == 2 || i18 == 1) {
                    j18 += ho6Var.f457871i - ho6Var.f457870h;
                }
            }
            java.util.LinkedList baseItemData = h70Var.f457437n.f456472e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(baseItemData, "baseItemData");
            java.util.Iterator it = baseItemData.iterator();
            int i19 = 0;
            int i27 = 0;
            while (it.hasNext()) {
                int i28 = ((r45.de) it.next()).f453871d;
                zu3.e eVar = zu3.e.f557329e;
                if (i28 == 2) {
                    i19++;
                } else if (i28 == 1) {
                    i27++;
                }
            }
            nu3.i iVar = nu3.i.f421751a;
            iVar.n("KEY_VIDEO_CROP_DURATION_MS_INT", java.lang.Long.valueOf(j18));
            iVar.n("KEY_ADD_EMOJI_COUNT_INT", java.lang.Integer.valueOf(i19));
            iVar.n("KEY_ADD_TEXT_COUNT_INT", java.lang.Integer.valueOf(i27));
            ut3.f fVar = ut3.f.f512709c;
            fVar.f512711b.putByteArray("video_composition", h70Var.mo14344x5f01b1f6());
            android.graphics.Bitmap.CompressFormat compressFormat = android.graphics.Bitmap.CompressFormat.JPEG;
            lp4.q0 q0Var = this.f401916f;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = q0Var.f401942h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 60, compressFormat, c16993xacc19624.C, true);
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196242 = q0Var.f401942h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc196242);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046 = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046(bool, "", c16993xacc196242.C, -1L, java.lang.Boolean.FALSE, iVar.l());
            ct0.b bVar = q0Var.f401943i;
            android.os.Bundle bundle2 = fVar.f512711b;
            if (bVar != null && (bundle = bVar.f303750n) != null) {
                byte[] byteArray = bundle.getByteArray("KEY_POST_VIDEO_TEMPLATE");
                bundle2.putByteArray("KEY_POST_VIDEO_TEMPLATE", byteArray);
                if (byteArray != null) {
                    op4.a.f428793a.a(2);
                }
            }
            bundle2.putParcelableArrayList("KEY_POST_HALF_RECT_LIST", kz5.c0.d(this.f401917g));
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196243 = q0Var.f401942h;
            if (c16993xacc196243 != null && (c16995x8ab634cd3 = c16993xacc196243.I) != null) {
                i17 = c16995x8ab634cd3.f237229m;
            }
            bundle2.putInt("key_ref_enter_scene", i17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196244 = q0Var.f401942h;
            if (c16993xacc196244 != null && (c16995x8ab634cd2 = c16993xacc196244.I) != null) {
                j17 = c16995x8ab634cd2.f237227h;
            }
            bundle2.putLong("key_ref_feed_id", j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc196245 = q0Var.f401942h;
            bundle2.putString("key_ref_feed_dup_flag", (c16993xacc196245 == null || (c16995x8ab634cd = c16993xacc196245.I) == null) ? null : c16995x8ab634cd.f237228i);
            fVar.a(q0Var.f401941g, c16991x15ced046);
            fVar.d(true, iVar.l());
            it3.y yVar = q0Var.f401944m;
            if (yVar != null) {
                jt3.h hVar = (jt3.h) yVar;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "onDestroy " + hVar.f383168g);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new jt3.f(hVar));
            }
        }
        return jz5.f0.f384359a;
    }
}
