package com.tencent.mm.plugin.backup.roambackup.storage.entity;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/backup/roambackup/storage/entity/BackupRangeInfo;", "Landroid/os/Parcelable;", "CREATOR", "po1/a", "po1/b", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class BackupRangeInfo implements android.os.Parcelable {
    public static final po1.a CREATOR = new po1.a(null);

    /* renamed from: d, reason: collision with root package name */
    public po1.b f92730d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f92731e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f92732f;

    /* renamed from: g, reason: collision with root package name */
    public long f92733g;

    /* renamed from: h, reason: collision with root package name */
    public long f92734h;

    public BackupRangeInfo(po1.b category, java.util.List labelIds, java.util.List talkers, long j17, long j18) {
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(labelIds, "labelIds");
        kotlin.jvm.internal.o.g(talkers, "talkers");
        this.f92730d = category;
        this.f92731e = labelIds;
        this.f92732f = talkers;
        this.f92733g = j17;
        this.f92734h = j18;
    }

    public final java.util.Collection a() {
        int ordinal = this.f92730d.ordinal();
        oo1.g gVar = oo1.g.f347143a;
        if (ordinal == 0) {
            return gVar.c();
        }
        if (ordinal == 1) {
            java.util.List ids = this.f92731e;
            kotlin.jvm.internal.o.g(ids, "ids");
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = ids.iterator();
            while (it.hasNext()) {
                java.util.ArrayList P1 = b93.r.wi().P1(java.lang.String.valueOf(((java.lang.Number) it.next()).intValue()));
                if (P1 != null) {
                    kz5.h0.u(hashSet, P1);
                }
            }
            return kz5.n0.t0(hashSet, this.f92732f);
        }
        if (ordinal != 2) {
            throw new jz5.j();
        }
        java.util.List c17 = gVar.c();
        java.util.HashSet hashSet2 = new java.util.HashSet();
        android.database.Cursor x17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().x("@convInBox", null, null);
        while (x17.moveToNext()) {
            try {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(x17);
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

    public final com.tencent.wechat.aff.affroam.i b() {
        com.tencent.wechat.aff.affroam.k kVar = new com.tencent.wechat.aff.affroam.k();
        com.tencent.wechat.aff.affroam.k kVar2 = new com.tencent.wechat.aff.affroam.k();
        com.tencent.wechat.aff.affroam.l lVar = new com.tencent.wechat.aff.affroam.l();
        lVar.f215884d = this.f92733g;
        lVar.f215885e = this.f92734h;
        po1.b bVar = this.f92730d;
        if (bVar == po1.b.f357289d || bVar == po1.b.f357291f) {
            kVar.f215877e.add(com.tencent.wechat.aff.affroam.j.kAll);
        }
        if (this.f92730d == po1.b.f357291f) {
            kVar2.f215877e.add(com.tencent.wechat.aff.affroam.j.kFoldChatRoom);
        }
        if (this.f92730d == po1.b.f357290e) {
            kVar.f215878f.addAll(this.f92731e);
            kVar.f215876d.addAll(this.f92732f);
        }
        com.tencent.wechat.aff.affroam.m mVar = new com.tencent.wechat.aff.affroam.m();
        mVar.f215898d = kVar;
        mVar.f215899e = kVar2;
        mVar.f215900f.add(lVar);
        com.tencent.wechat.aff.affroam.i iVar = new com.tencent.wechat.aff.affroam.i();
        iVar.f215841d.add(mVar);
        return iVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        if (!(obj instanceof com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo)) {
            return false;
        }
        com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo backupRangeInfo = (com.tencent.mm.plugin.backup.roambackup.storage.entity.BackupRangeInfo) obj;
        if (this.f92730d != backupRangeInfo.f92730d) {
            return false;
        }
        java.util.List list = this.f92731e;
        if (list.size() != backupRangeInfo.f92731e.size()) {
            return false;
        }
        java.util.List list2 = this.f92732f;
        if (list2.size() != backupRangeInfo.f92732f.size() || this.f92733g != backupRangeInfo.f92733g || this.f92734h != backupRangeInfo.f92734h) {
            return false;
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!backupRangeInfo.f92731e.contains(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()))) {
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
                if (!backupRangeInfo.f92732f.contains((java.lang.String) it6.next())) {
                    z18 = false;
                    break;
                }
            }
        }
        z18 = true;
        return z18;
    }

    public int hashCode() {
        return (((((((this.f92730d.hashCode() * 31) + this.f92731e.hashCode()) * 31) + this.f92732f.hashCode()) * 31) + java.lang.Long.hashCode(this.f92733g)) * 31) + java.lang.Long.hashCode(this.f92734h);
    }

    public java.lang.String toString() {
        return "BackupRangeInfo(category=" + this.f92730d + ", labelIds=" + this.f92731e + ", talkers=" + this.f92732f + ", startTime=" + this.f92733g + ", endTime=" + this.f92734h + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        kotlin.jvm.internal.o.g(parcel, "parcel");
        parcel.writeInt(this.f92730d.ordinal());
        parcel.writeString(kz5.n0.g0(this.f92731e, ",", null, null, 0, null, null, 62, null));
        parcel.writeStringList(this.f92732f);
        parcel.writeLong(this.f92733g);
        parcel.writeLong(this.f92734h);
    }

    public /* synthetic */ BackupRangeInfo(po1.b bVar, java.util.List list, java.util.List list2, long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? po1.b.f357289d : bVar, (i17 & 2) != 0 ? new java.util.ArrayList() : list, (i17 & 4) != 0 ? new java.util.ArrayList() : list2, (i17 & 8) != 0 ? 0L : j17, (i17 & 16) == 0 ? j18 : 0L);
    }
}
