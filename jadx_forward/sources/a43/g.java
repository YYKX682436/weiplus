package a43;

/* loaded from: classes11.dex */
public class g implements com.p314xaae8f345.mm.p2470x93e71c27.ui.j1, com.p314xaae8f345.mm.p2470x93e71c27.ui.k1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f82749d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 f82750e;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.ui.j1 j1Var) {
        this.f82750e = j1Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f82750e.W0((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public void X9(com.p314xaae8f345.mm.p2470x93e71c27.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            android.util.Pair b17 = b(n1Var.f272434m);
            boolean booleanValue = ((java.lang.Boolean) b17.second).booleanValue();
            java.lang.String str = (java.lang.String) b17.first;
            if (!booleanValue) {
                n1Var.f272436o = new a43.f(this, str, n1Var);
                this.f82750e.X9(n1Var);
            } else {
                ((java.util.ArrayList) this.f82749d).add(new java.lang.ref.WeakReference(n1Var));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0045, code lost:
    
        if (r4 == null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r4 == null) goto L13;
     */
    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Bitmap Zg(java.lang.String r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            android.util.Pair r3 = r2.b(r3)
            java.lang.Object r0 = r3.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r3 = r3.second
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L95
            java.lang.Class<u33.g> r3 = u33.g.class
            i95.m r4 = i95.n0.c(r3)
            u33.g r4 = (u33.g) r4
            s33.d r4 = (s33.d) r4
            u33.h r4 = r4.Bi(r0)
            r5 = 0
            if (r4 == 0) goto L2a
            y33.e r4 = (y33.e) r4
            java.lang.String r4 = r4.f66951x81118851
            if (r4 != 0) goto L4b
            goto L47
        L2a:
            java.lang.Class<y33.h> r4 = y33.h.class
            i95.m r4 = i95.n0.c(r4)
            y33.h r4 = (y33.h) r4
            java.util.List r4 = r4.e(r0)
            boolean r6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(r4)
            if (r6 != 0) goto L4a
            r6 = 0
            java.lang.Object r4 = r4.get(r6)
            y33.g r4 = (y33.g) r4
            java.lang.String r4 = r4.f68996x81118851
            if (r4 != 0) goto L4b
        L47:
            java.lang.String r4 = ""
            goto L4b
        L4a:
            r4 = r5
        L4b:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "AvatarUrl =  "
            r6.<init>(r1)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "ChatroomMemberPreloadManager.avatar"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r6)
            if (r4 == 0) goto L84
            vo0.d r6 = a43.h.f82751a
            a43.a r1 = new a43.a
            r1.<init>(r4)
            wo0.c r4 = r6.a(r1)
            java.lang.Object r6 = r4.e()
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 == 0) goto L7a
            boolean r1 = r6.isRecycled()
            if (r1 != 0) goto L7a
            return r6
        L7a:
            a43.e r6 = new a43.e
            r6.<init>(r2)
            r4.f529406d = r6
            r4.a()
        L84:
            i95.m r3 = i95.n0.c(r3)
            u33.g r3 = (u33.g) r3
            a43.d r4 = new a43.d
            r4.<init>(r2, r0)
            s33.d r3 = (s33.d) r3
            r3.wi(r0, r4)
            return r5
        L95:
            com.tencent.mm.pluginsdk.ui.j1 r3 = r2.f82750e
            android.graphics.Bitmap r3 = r3.Zg(r0, r4, r5, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a43.g.Zg(java.lang.String, int, int, int):android.graphics.Bitmap");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k1
    public boolean a(java.lang.String str) {
        return false;
    }

    public final android.util.Pair b(java.lang.String str) {
        return new android.util.Pair(str, java.lang.Boolean.valueOf(str != null ? str.endsWith("@gamelifechatroom") : false));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    /* renamed from: loadBitmap */
    public android.graphics.Bitmap mo560xd586ddb5(java.lang.String str) {
        android.util.Pair b17 = b(str);
        if (((java.lang.Boolean) b17.second).booleanValue()) {
            return Zg(str, 0, 0, 0);
        }
        return this.f82750e.mo560xd586ddb5((java.lang.String) b17.first);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.j1
    public android.graphics.Bitmap uc() {
        return this.f82750e.uc();
    }
}
