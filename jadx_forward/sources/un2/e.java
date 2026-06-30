package un2;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f510992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un2.k f510993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p944x882e457a.f fVar, un2.k kVar) {
        super(0);
        this.f510992d = fVar;
        this.f510993e = kVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        un2.k kVar;
        boolean z17 = false;
        un2.k kVar2 = this.f510993e;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f510992d;
        if (fVar != null) {
            int i17 = fVar.f152149b;
            int i18 = fVar.f152148a;
            java.lang.String str = fVar.f152150c;
            if (i17 != -4014) {
                long m75942xfb822ef2 = ((r45.z41) fVar.f152151d).m75942xfb822ef2(3);
                long m75942xfb822ef22 = ((r45.z41) fVar.f152151d).m75942xfb822ef2(4);
                if (i18 != 4 || m75942xfb822ef2 <= 0 || m75942xfb822ef2 >= m75942xfb822ef22 || m75942xfb822ef2 <= kVar2.f511007d) {
                    kVar = kVar2;
                    kVar.f511009f = false;
                } else {
                    long j17 = 1000;
                    kVar = kVar2;
                    un2.k.a(kVar, (int) (m75942xfb822ef2 / j17), (int) (m75942xfb822ef22 / j17));
                    kVar.f511007d = m75942xfb822ef2;
                    kVar.f511008e = m75942xfb822ef22;
                    kVar.f511009f = true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderBulletLoader", "onGetBulletCgiFailure: errType=" + i18 + ", errCode=" + i17 + ", errMsg=" + str + "hasMore=" + kVar.f511009f + ", minBulletTime=" + m75942xfb822ef2 + ", maxBulletTime=" + m75942xfb822ef22);
                z17 = false;
                kVar.f511010g = z17;
                return jz5.f0.f384359a;
            }
            android.content.Context context = kVar2.f511011h;
            if (context != null) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
                u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.own));
                u1Var.a(true);
                u1Var.l(un2.d.f510991a);
                u1Var.q(false);
            }
            kVar2.f511013j = null;
        }
        kVar = kVar2;
        kVar.f511010g = z17;
        return jz5.f0.f384359a;
    }
}
