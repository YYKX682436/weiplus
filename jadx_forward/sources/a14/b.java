package a14;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final a14.b f82128a = new a14.b();

    /* JADX WARN: Code restructure failed: missing block: B:191:0x06a3, code lost:
    
        if (t21.d3.b(r7) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0187, code lost:
    
        if (r1.f404166a <= 0) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0867  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.j4 a(android.content.Context r25, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 2231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.b.a(android.content.Context, com.tencent.mm.storage.f9, java.lang.String):r45.j4");
    }

    public final long b(r45.j4 addMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addMsg, "addMsg");
        java.lang.String str = "msg_" + addMsg.f459091e + '_' + addMsg.f459092f + '_' + addMsg.f459101r + '_' + c01.y1.a(c01.z1.r(), c01.id.a()).hashCode();
        java.nio.charset.Charset charset = r26.c.f450398a;
        byte[] bytes = str.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
        byte[] bytes2 = g17.getBytes(charset);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bytes2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wrap, "wrap(...)");
        long j17 = wrap.getLong();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
        return j17;
    }

    public final r45.uy c(java.util.List list) {
        if (list == null) {
            return null;
        }
        r45.uy uyVar = new r45.uy();
        java.lang.String r17 = c01.z1.r();
        java.util.ArrayList<com.p314xaae8f345.mm.p2621x8fb0427b.f9> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(com.p314xaae8f345.mm.p2621x8fb0427b.f9.M1((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next()));
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : arrayList) {
            a14.b bVar = f82128a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            r45.j4 a17 = bVar.a(context, f9Var, r17);
            a17.f459099p = c01.ia.Q(f9Var.G, f9Var.mo78012x3fdd41df(), a17.f459101r, bVar.b(a17));
            uyVar.f469265d.add(a17);
        }
        return uyVar;
    }
}
