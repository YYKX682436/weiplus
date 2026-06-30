package ap1;

/* loaded from: classes5.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.f1 f12647d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(ap1.f1 f1Var) {
        super(1);
        this.f12647d = f1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        ap1.c2 state = (ap1.c2) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof ap1.d)) {
            ap1.d dVar2 = (ap1.d) dVar;
            ap1.f1 f1Var = this.f12647d;
            f1Var.getClass();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report, pageId=");
            long j17 = state.f12627h;
            sb6.append(j17);
            sb6.append(", action.event=");
            ap1.e eVar = dVar2.f12632a;
            sb6.append(eVar);
            java.lang.String sb7 = sb6.toString();
            java.lang.String str = f1Var.f12661d;
            com.tencent.mars.xlog.Log.i(str, sb7);
            com.tencent.mm.plugin.backup.roambackup.y1 y1Var = com.tencent.mm.plugin.backup.roambackup.y1.S;
            if (j17 == 9) {
                int ordinal = eVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        y1Var = com.tencent.mm.plugin.backup.roambackup.y1.X;
                    } else if (ordinal == 2) {
                        y1Var = com.tencent.mm.plugin.backup.roambackup.y1.V;
                    } else if (ordinal == 3) {
                        y1Var = com.tencent.mm.plugin.backup.roambackup.y1.W;
                    } else if (ordinal == 4) {
                        y1Var = com.tencent.mm.plugin.backup.roambackup.y1.T;
                    } else {
                        if (ordinal != 5) {
                            throw new jz5.j();
                        }
                        y1Var = com.tencent.mm.plugin.backup.roambackup.y1.U;
                    }
                }
            } else {
                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92952t;
                if (j17 == 4) {
                    int ordinal2 = eVar.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 == 2) {
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92955w;
                            } else if (ordinal2 == 3) {
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92956x;
                            } else if (ordinal2 == 4) {
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92953u;
                            } else {
                                if (ordinal2 != 5) {
                                    throw new jz5.j();
                                }
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92954v;
                            }
                        }
                    }
                } else {
                    y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92960y0;
                    if (j17 == 11) {
                        int ordinal3 = eVar.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 == 1) {
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92963z1;
                            } else if (ordinal3 == 2) {
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92958x1;
                            } else if (ordinal3 == 3) {
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92961y1;
                            } else if (ordinal3 == 4) {
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92942l1;
                            } else {
                                if (ordinal3 != 5) {
                                    throw new jz5.j();
                                }
                                y1Var = com.tencent.mm.plugin.backup.roambackup.y1.f92948p1;
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w(str, "Skip report for pageId=" + j17);
                    }
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RoamReport28098", "start simple report for pageAction=" + y1Var);
            com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct roamBackupRecoverReport28098Struct = new com.tencent.mm.autogen.mmdata.rpt.RoamBackupRecoverReport28098Struct();
            roamBackupRecoverReport28098Struct.f60066d = y1Var.f92964d;
            roamBackupRecoverReport28098Struct.f60067e = y1Var.f92965e;
            yz5.l lVar = dVar2.f12633b;
            if (lVar != null) {
                lVar.invoke(roamBackupRecoverReport28098Struct);
            }
            roamBackupRecoverReport28098Struct.k();
        }
        return jz5.f0.f302826a;
    }
}
