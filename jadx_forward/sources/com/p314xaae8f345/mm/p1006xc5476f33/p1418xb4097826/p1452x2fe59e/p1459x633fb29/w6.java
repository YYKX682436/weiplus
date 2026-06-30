package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class w6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x {

    /* renamed from: d, reason: collision with root package name */
    public int f189964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13907xeefe541f f189965e;

    public w6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13907xeefe541f c13907xeefe541f) {
        this.f189965e = c13907xeefe541f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: dealOnSceneEnd */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13924x37151faa mo983xfcd2013a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.i iVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        java.util.ArrayList arrayList = null;
        if (!(fVar instanceof bw5.v6)) {
            return null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.x6 x6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.x6(i17, i18, str);
        bw5.v6 v6Var = (bw5.v6) fVar;
        x6Var.m56419xdac5ee4d(v6Var.f115696f);
        java.util.LinkedList<bw5.q5> linkedList = v6Var.f115694d;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.q5 q5Var : linkedList) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q5Var);
                arrayList.add(new so2.q1(q5Var));
            }
        }
        x6Var.m56420x2a5f836b(arrayList);
        x6Var.m56421x73095078(v6Var.f115697g[3] ? v6Var.f115695e : com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b);
        x6Var.m56423xd4b4a5a1(this.f189964d);
        return x6Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genLoadMoreCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo984xd7029bba() {
        java.lang.String ek6;
        this.f189964d = 2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13907xeefe541f c13907xeefe541f = this.f189965e;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c13907xeefe541f.f189136e.mo7430x19263085();
        android.content.Intent intent = mo7430x19263085 != null ? mo7430x19263085.getIntent() : null;
        if (intent == null) {
            return null;
        }
        long longExtra = intent.getLongExtra("finder_from_feed_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("finder_from_feed_dup_flag");
        if (intent.hasExtra("finder_from_session_buffer")) {
            ek6 = intent.getStringExtra("finder_from_session_buffer");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            r45.qt2 m56354xfe9224be = c13907xeefe541f.m56354xfe9224be();
            ek6 = o3Var.ek(longExtra, stringExtra, m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(7) : 0);
        }
        return new db2.n1(c13907xeefe541f.f189135d, c13907xeefe541f.m56357x44e5026c(), c13907xeefe541f.m56354xfe9224be(), java.lang.String.valueOf(longExtra), ek6);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.x
    /* renamed from: genRefreshCgi */
    public com.p314xaae8f345.mm.p944x882e457a.i mo985x5db54b1a() {
        java.lang.String ek6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.C13907xeefe541f c13907xeefe541f = this.f189965e;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c13907xeefe541f.f189136e.mo7430x19263085();
        android.content.Intent intent = mo7430x19263085 != null ? mo7430x19263085.getIntent() : null;
        if (intent == null) {
            return null;
        }
        long longExtra = intent.getLongExtra("finder_from_feed_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("finder_from_feed_dup_flag");
        if (intent.hasExtra("finder_from_session_buffer")) {
            ek6 = intent.getStringExtra("finder_from_session_buffer");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            r45.qt2 m56354xfe9224be = c13907xeefe541f.m56354xfe9224be();
            ek6 = o3Var.ek(longExtra, stringExtra, m56354xfe9224be != null ? m56354xfe9224be.m75939xb282bd08(7) : 0);
        }
        return new db2.n1(c13907xeefe541f.f189135d, null, c13907xeefe541f.m56354xfe9224be(), java.lang.String.valueOf(longExtra), ek6);
    }
}
