package ov2;

/* loaded from: classes10.dex */
public abstract class e extends pv2.m {

    /* renamed from: e */
    public final java.lang.String f430708e;

    /* renamed from: f */
    public long f430709f;

    /* renamed from: g */
    public long f430710g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String taskId) {
        super(taskId);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        this.f430708e = "Finder.FinderTaskStage";
    }

    public static /* synthetic */ void i(ov2.e eVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, int i17, java.lang.String str2, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportTrace");
        }
        if ((i18 & 4) != 0) {
            i17 = 0;
        }
        if ((i18 & 8) != 0) {
            str2 = "";
        }
        eVar.h(str, c14994x9b99c079, i17, str2);
    }

    @Override // pv2.m
    public pv2.g c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task-");
        java.lang.String str = this.f440115d;
        sb6.append(str);
        sb6.append(" start");
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f430708e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        this.f430709f = c01.id.c();
        this.f430710g = 0L;
        pv2.g j17 = j();
        this.f430710g = c01.id.c() - this.f430709f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "task-" + str + " end");
        return j17;
    }

    public final long g() {
        long j17 = this.f430710g;
        return j17 == 0 ? c01.id.c() - this.f430709f : j17;
    }

    public final void h(java.lang.String customKey, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(customKey, "customKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        p2Var.I(customKey, finderItem.f66946x284ddcb8, p2Var.q(finderItem.f66946x284ddcb8, finderItem, i17, str));
    }

    public abstract pv2.g j();
}
