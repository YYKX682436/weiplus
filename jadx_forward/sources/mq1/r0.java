package mq1;

/* loaded from: classes11.dex */
public class r0 implements com.p314xaae8f345.mm.p944x882e457a.h2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f412218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mq1.s0 f412219e;

    public r0(mq1.s0 s0Var, android.content.Context context) {
        this.f412219e = s0Var;
        this.f412218d = context;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.h2
    public void n(com.p314xaae8f345.mm.p944x882e457a.r1 r1Var) {
        boolean z17 = l75.d1.f398478a;
        if (l75.d1.f398480c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMCoreInitTask", "onPrepareDispatcher, disable push");
        } else {
            this.f412219e.f412220d.a(this.f412218d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6.f136417h.f89204a) == false) goto L10;
     */
    @Override // com.p314xaae8f345.mm.p944x882e457a.h2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(com.p314xaae8f345.mm.p944x882e457a.r1 r6, boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto La9
            boolean r6 = r6.f152304n
            if (r6 != 0) goto La9
            mq1.s0 r6 = r5.f412219e
            r6.getClass()
            boolean r6 = b21.m.c()
            r7 = 0
            if (r6 == 0) goto L13
            goto L2a
        L13:
            com.tencent.mm.autogen.events.TalkRoomServerEvent r6 = new com.tencent.mm.autogen.events.TalkRoomServerEvent
            r6.<init>()
            am.oy r0 = r6.f136416g
            r1 = 1
            r0.f89116a = r1
            r6.e()
            am.py r6 = r6.f136417h
            java.lang.String r6 = r6.f89204a
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            if (r6 != 0) goto L2b
        L2a:
            r1 = r7
        L2b:
            java.lang.String r6 = "MicroMsg.MMCoreInitTask"
            if (r1 != 0) goto L35
            java.lang.String r7 = "can't kill the working process"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r6, r7)
            return
        L35:
            com.p314xaae8f345.mm.ui.vb.k()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40528x3103a4f1()
            com.p314xaae8f345.p542x3306d5.C4436xdd79435b.m37523x79d8456e(r7)
            boolean r0 = com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84223xdac2174d()
            if (r0 == 0) goto L47
            com.p314xaae8f345.p2841xd11c237d.C23006xdd79435b.m84236x79d8456e(r7)
        L47:
            java.lang.String r0 = "now killing the working process...."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r0)
            java.util.HashSet r6 = x51.e.f533522a
            byte[] r6 = x51.d.f533510i
            android.content.Context r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.tencent.mm.booter.NotifyReceiver$NotifyService> r1 = com.p314xaae8f345.mm.p642xad8b531f.C10296x7f15878.NotifyService.class
            r0.<init>(r6, r1)
            j45.l.D(r0)
            mq1.q0 r6 = new mq1.q0
            r6.<init>(r5)
            java.util.List r0 = com.p314xaae8f345.mm.p943x351df9c2.b1.f151958a
            gm0.m r0 = gm0.j1.b()
            boolean r0 = r0.m()
            if (r0 != 0) goto L6e
            goto La9
        L6e:
            com.tencent.mm.modelavatar.s0 r0 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni()
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            r3 = 2
            l75.k0 r0 = r0.f152072d
            java.lang.String r4 = "select username from img_flag where username not in (select username from rcontact ) and username not like \"%@qqim\" and username not like \"%@bottle\";"
            android.database.Cursor r0 = r0.f(r4, r2, r3)
        L84:
            boolean r2 = r0.moveToNext()
            if (r2 == 0) goto L92
            java.lang.String r2 = r0.getString(r7)
            r1.add(r2)
            goto L84
        L92:
            r0.close()
            com.p314xaae8f345.mm.p943x351df9c2.b1.f151958a = r1
            int r7 = r1.size()
            if (r7 > 0) goto L9e
            goto La9
        L9e:
            com.tencent.mm.modelavatar.z0 r7 = com.p314xaae8f345.mm.p943x351df9c2.b1.f151960c
            com.tencent.mm.modelavatar.a1 r0 = r7.f152114g
            r0.f151956d = r6
            r0 = 10
            r7.c(r0, r0)
        La9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq1.r0.o(com.tencent.mm.modelbase.r1, boolean):void");
    }
}
