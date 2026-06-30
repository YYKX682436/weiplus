package com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/BackupRangeInfo;", "Landroid/os/Parcelable;", "CREATOR", "po1/a", "po1/b", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo */
/* loaded from: classes5.dex */
public final /* data */ class C12853x6acde7c9 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final po1.a f35348x681a0c0c = new po1.a(null);

    /* renamed from: d, reason: collision with root package name */
    public po1.b f174263d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f174264e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f174265f;

    /* renamed from: g, reason: collision with root package name */
    public long f174266g;

    /* renamed from: h, reason: collision with root package name */
    public long f174267h;

    public C12853x6acde7c9(po1.b category, java.util.List labelIds, java.util.List talkers, long j17, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelIds, "labelIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkers, "talkers");
        this.f174263d = category;
        this.f174264e = labelIds;
        this.f174265f = talkers;
        this.f174266g = j17;
        this.f174267h = j18;
    }

    public final java.util.Collection a() {
        int ordinal = this.f174263d.ordinal();
        oo1.g gVar = oo1.g.f428676a;
        if (ordinal == 0) {
            return gVar.c();
        }
        if (ordinal == 1) {
            java.util.List ids = this.f174264e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ids, "ids");
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = ids.iterator();
            while (it.hasNext()) {
                java.util.ArrayList P1 = b93.r.wi().P1(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
                if (P1 != null) {
                    kz5.h0.u(hashSet, P1);
                }
            }
            return kz5.n0.t0(hashSet, this.f174265f);
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        java.util.List c17 = gVar.c();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        android.database.Cursor x17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().x("@convInBox", null, null);
        while (x17.moveToNext()) {
            try {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
                z3Var.mo9015xbf5d97fd(x17);
                hashSet2.add(z3Var.d1());
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(x17, th6);
                    throw th7;
                }
            }
        }
        vz5.b.a(x17, null);
        return kz5.n0.q0(c17, hashSet2);
    }

    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i b() {
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k kVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.k();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l lVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.l();
        lVar.f297417d = this.f174266g;
        lVar.f297418e = this.f174267h;
        po1.b bVar = this.f174263d;
        if (bVar == po1.b.f438822d || bVar == po1.b.f438824f) {
            kVar.f297410e.add(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kAll);
        }
        if (this.f174263d == po1.b.f438824f) {
            kVar2.f297410e.add(com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.j.kFoldChatRoom);
        }
        if (this.f174263d == po1.b.f438823e) {
            kVar.f297411f.addAll(this.f174264e);
            kVar.f297409d.addAll(this.f174265f);
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m mVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.m();
        mVar.f297431d = kVar;
        mVar.f297432e = kVar2;
        mVar.f297433f.add(lVar);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i iVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.i();
        iVar.f297374d.add(mVar);
        return iVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m53973xb2c87fbf(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9 c12853x6acde7c9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1262x8fb0427b.p1263xb29de3e3.C12853x6acde7c9) obj;
        if (this.f174263d != c12853x6acde7c9.f174263d) {
            return false;
        }
        java.util.List list = this.f174264e;
        if (list.size() != c12853x6acde7c9.f174264e.size()) {
            return false;
        }
        java.util.List list2 = this.f174265f;
        if (list2.size() != c12853x6acde7c9.f174265f.size() || this.f174266g != c12853x6acde7c9.f174266g || this.f174267h != c12853x6acde7c9.f174267h) {
            return false;
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!c12853x6acde7c9.f174264e.contains(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()))) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (!z17) {
            return false;
        }
        if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
            java.util.Iterator it6 = list2.iterator();
            while (it6.hasNext()) {
                if (!c12853x6acde7c9.f174265f.contains((java.lang.String) it6.next())) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = true;
        return z18;
    }

    /* renamed from: hashCode */
    public int m53974x8cdac1b() {
        return (((((((this.f174263d.hashCode() * 31) + this.f174264e.hashCode()) * 31) + this.f174265f.hashCode()) * 31) + java.lang.Long.hashCode(this.f174266g)) * 31) + java.lang.Long.hashCode(this.f174267h);
    }

    /* renamed from: toString */
    public java.lang.String m53975x9616526c() {
        return "BackupRangeInfo(category=" + this.f174263d + ", labelIds=" + this.f174264e + ", talkers=" + this.f174265f + ", startTime=" + this.f174266g + ", endTime=" + this.f174267h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
        parcel.writeInt(this.f174263d.ordinal());
        parcel.writeString(kz5.n0.g0(this.f174264e, ",", null, null, 0, null, null, 62, null));
        parcel.writeStringList(this.f174265f);
        parcel.writeLong(this.f174266g);
        parcel.writeLong(this.f174267h);
    }

    public /* synthetic */ C12853x6acde7c9(po1.b bVar, java.util.List list, java.util.List list2, long j17, long j18, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? po1.b.f438822d : bVar, (i17 & 2) != 0 ? new java.util.ArrayList() : list, (i17 & 4) != 0 ? new java.util.ArrayList() : list2, (i17 & 8) != 0 ? 0L : j17, (i17 & 16) == 0 ? j18 : 0L);
    }
}
