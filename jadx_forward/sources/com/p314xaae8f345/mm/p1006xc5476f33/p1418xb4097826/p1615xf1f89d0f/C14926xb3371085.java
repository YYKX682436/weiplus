package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0006*\u0001\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/finder/publish/LiteAppFinderPostModule;", "Lbd/d;", "Lorg/json/JSONObject;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Ljz5/f0;", "openFinderPost", "", "TAG", "Ljava/lang/String;", "com/tencent/mm/plugin/finder/publish/LiteAppFinderPostModule$feedProgressListener$1", "feedProgressListener", "Lcom/tencent/mm/plugin/finder/publish/LiteAppFinderPostModule$feedProgressListener$1;", "<init>", "()V", "plugin-finder-publish_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.publish.LiteAppFinderPostModule */
/* loaded from: classes10.dex */
public final class C14926xb3371085 extends bd.d {
    private final java.lang.String TAG = "LogPost.LiteAppFinderPostModule";
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14927x5e5a638b feedProgressListener;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.publish.LiteAppFinderPostModule$feedProgressListener$1] */
    public C14926xb3371085() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.feedProgressListener = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(a0Var) { // from class: com.tencent.mm.plugin.finder.publish.LiteAppFinderPostModule$feedProgressListener$1
            {
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                java.lang.String unused;
                java.lang.String unused2;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14926xb3371085 c14926xb3371085 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14926xb3371085.this;
                unused = c14926xb3371085.TAG;
                am.ga gaVar = event.f135783g;
                long j17 = gaVar.f88282a;
                try {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(dm.i4.f66867x2a5c95c7, gaVar.f88282a);
                    jSONObject.put("progress", gaVar.f88283b);
                    jSONObject.put("status", gaVar.f88284c);
                    c14926xb3371085.m10168x71965dbb().a(jSONObject, true, false);
                } catch (java.lang.Exception unused3) {
                    unused2 = c14926xb3371085.TAG;
                }
                if (gaVar.f88283b == 100) {
                    mo48814x2efc64();
                }
                return true;
            }
        };
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(3:2|3|(1:5)(1:48))|(19:7|8|9|10|(1:12)(1:43)|(13:14|15|16|17|(1:19)(1:38)|(2:21|22)|24|25|26|(1:28)|(2:30|31)|33|34)|42|15|16|17|(0)(0)|(0)|24|25|26|(0)|(0)|33|34)|47|8|9|10|(0)(0)|(0)|42|15|16|17|(0)(0)|(0)|24|25|26|(0)|(0)|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        r15 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetInt", "", r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0058, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0059, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x003c, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x003d, code lost:
    
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeGetString", "", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:10:0x002c, B:14:0x0037), top: B:9:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0052 A[Catch: Exception -> 0x0058, TRY_LEAVE, TryCatch #1 {Exception -> 0x0058, blocks: (B:17:0x0047, B:21:0x0052), top: B:16:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d A[Catch: Exception -> 0x0073, TRY_LEAVE, TryCatch #2 {Exception -> 0x0073, blocks: (B:26:0x0064, B:30:0x006d), top: B:25:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0034  */
    @bd.c(m10165xc19dc9be = true)
    /* renamed from: openFinderPost */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m58765xe7752fd0(org.json.JSONObject r15) {
        /*
            r14 = this;
            java.lang.String r0 = "safeGetString"
            java.lang.String r1 = ""
            java.lang.String r2 = "data"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r2)
            r15.toString()
            java.lang.String r2 = "linkTips"
            r3 = 0
            r4 = 1
            r5 = 0
            boolean r6 = r15.has(r2)     // Catch: java.lang.Exception -> L21
            if (r6 != r4) goto L19
            r6 = r4
            goto L1a
        L19:
            r6 = r3
        L1a:
            if (r6 == 0) goto L29
            java.lang.String r2 = r15.getString(r2)     // Catch: java.lang.Exception -> L21
            goto L2a
        L21:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r0, r1, r2)
        L29:
            r2 = r5
        L2a:
            java.lang.String r6 = "postTips"
            boolean r7 = r15.has(r6)     // Catch: java.lang.Exception -> L3c
            if (r7 != r4) goto L34
            r7 = r4
            goto L35
        L34:
            r7 = r3
        L35:
            if (r7 == 0) goto L44
            java.lang.String r6 = r15.getString(r6)     // Catch: java.lang.Exception -> L3c
            goto L45
        L3c:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r0, r1, r6)
        L44:
            r6 = r5
        L45:
            java.lang.String r7 = "bypassData"
            boolean r8 = r15.has(r7)     // Catch: java.lang.Exception -> L58
            if (r8 != r4) goto L4f
            r8 = r4
            goto L50
        L4f:
            r8 = r3
        L50:
            if (r8 == 0) goto L60
            java.lang.String r0 = r15.getString(r7)     // Catch: java.lang.Exception -> L58
            r5 = r0
            goto L60
        L58:
            r7 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r0, r1, r7)
        L60:
            java.lang.String r0 = "enterScene"
            r7 = 108(0x6c, float:1.51E-43)
            boolean r8 = r15.has(r0)     // Catch: java.lang.Exception -> L73
            if (r8 != r4) goto L6b
            r3 = r4
        L6b:
            if (r3 == 0) goto L7d
            int r15 = r15.getInt(r0)     // Catch: java.lang.Exception -> L73
            r7 = r15
            goto L7d
        L73:
            r15 = move-exception
            java.lang.String r0 = "safeGetInt"
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r0, r1, r15)
        L7d:
            qs2.e r10 = new qs2.e
            r15 = 2
            r0 = 30
            r10.<init>(r15, r7, r0)
            r10.f447813v = r2
            r10.f447812u = r6
            r10.f447814w = r5
            java.lang.Class<w40.e> r15 = w40.e.class
            i95.m r15 = i95.n0.c(r15)
            java.lang.String r0 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r15, r0)
            r8 = r15
            w40.e r8 = (w40.e) r8
            com.tencent.mm.plugin.finder.assist.v1 r15 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a
            android.content.Context r9 = r15.b()
            r11 = 0
            r12 = 4
            r13 = 0
            w40.e.Df(r8, r9, r10, r11, r12, r13)
            com.tencent.mm.plugin.finder.publish.LiteAppFinderPostModule$feedProgressListener$1 r15 = r14.feedProgressListener
            r15.mo48813x58998cd()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1615xf1f89d0f.C14926xb3371085.m58765xe7752fd0(org.json.JSONObject):void");
    }
}
