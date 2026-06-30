package uv4;

/* loaded from: classes8.dex */
public final class j extends ea5.l {
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: getProjectId */
    public java.lang.String mo472xca17635e() {
        return "ilinkres_6362f858";
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0087 A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:3:0x003f, B:5:0x0045, B:12:0x0059, B:16:0x007b, B:18:0x0087, B:20:0x008d, B:23:0x009d, B:26:0x0065, B:30:0x0070, B:34:0x00c2), top: B:2:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:3:0x003f, B:5:0x0045, B:12:0x0059, B:16:0x007b, B:18:0x0087, B:20:0x008d, B:23:0x009d, B:26:0x0065, B:30:0x0070, B:34:0x00c2), top: B:2:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d A[Catch: Exception -> 0x00d6, TryCatch #0 {Exception -> 0x00d6, blocks: (B:3:0x003f, B:5:0x0045, B:12:0x0059, B:16:0x007b, B:18:0x0087, B:20:0x008d, B:23:0x009d, B:26:0x0065, B:30:0x0070, B:34:0x00c2), top: B:2:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008a  */
    @Override // ea5.l, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.i
    /* renamed from: postProcessAsync */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo473xaee99e0d(long r7, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x r9) {
        /*
            r6 = this;
            java.lang.String r0 = "postProcess success: "
            java.lang.String r1 = "postProcess: failed to get WebSearchTemplateByUDR for type "
            java.lang.String r2 = "postProcess: unknown resource name: "
            java.lang.String r3 = "resource"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r3)
            super.mo473xaee99e0d(r7, r9)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "postProcess: name="
            r7.<init>(r8)
            java.lang.String r8 = r9.m117638xfb82e301()
            r7.append(r8)
            java.lang.String r8 = ", path="
            r7.append(r8)
            java.lang.String r8 = r9.m117639xfb83cc9b()
            r7.append(r8)
            java.lang.String r8 = ", postPath="
            r7.append(r8)
            java.lang.String r8 = r9.c()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "WebSearchTemplateFeatureService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r7)
            r7 = 0
            java.lang.String r3 = r9.m117638xfb82e301()     // Catch: java.lang.Exception -> Ld6
            if (r3 == 0) goto Lc2
            int r4 = r3.hashCode()     // Catch: java.lang.Exception -> Ld6
            r5 = -1908279147(0xffffffff8e41f895, float:-2.3908775E-30)
            if (r4 == r5) goto L70
            r5 = -66670060(0xfffffffffc06b214, float:-2.7975185E36)
            if (r4 == r5) goto L65
            r5 = 450447364(0x1ad94804, float:8.9865444E-23)
            if (r4 == r5) goto L59
            goto Lc2
        L59:
            java.lang.String r4 = "esc_template"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Ld6
            if (r3 != 0) goto L62
            goto Lc2
        L62:
            r2 = 10
            goto L7b
        L65:
            java.lang.String r4 = "fts_template"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Ld6
            if (r3 != 0) goto L6e
            goto Lc2
        L6e:
            r2 = r7
            goto L7b
        L70:
            java.lang.String r4 = "tsc_template"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> Ld6
            if (r3 != 0) goto L7a
            goto Lc2
        L7a:
            r2 = 6
        L7b:
            uv4.x r3 = uv4.x.f512991a     // Catch: java.lang.Exception -> Ld6
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Ld6
            uv4.g r3 = r3.c(r2, r4)     // Catch: java.lang.Exception -> Ld6
            boolean r4 = r3 instanceof uv4.p     // Catch: java.lang.Exception -> Ld6
            if (r4 == 0) goto L8a
            uv4.p r3 = (uv4.p) r3     // Catch: java.lang.Exception -> Ld6
            goto L8b
        L8a:
            r3 = 0
        L8b:
            if (r3 != 0) goto L9d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r9.<init>(r1)     // Catch: java.lang.Exception -> Ld6
            r9.append(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> Ld6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r9)     // Catch: java.lang.Exception -> Ld6
            return
        L9d:
            java.lang.String r1 = r9.m117639xfb83cc9b()     // Catch: java.lang.Exception -> Ld6
            java.lang.String r2 = "getPath(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r2)     // Catch: java.lang.Exception -> Ld6
            r3.z(r1)     // Catch: java.lang.Exception -> Ld6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r1.<init>(r0)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r9 = r9.m117638xfb82e301()     // Catch: java.lang.Exception -> Ld6
            r1.append(r9)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r9 = " processed"
            r1.append(r9)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r9 = r1.toString()     // Catch: java.lang.Exception -> Ld6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r9)     // Catch: java.lang.Exception -> Ld6
            return
        Lc2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld6
            r0.<init>(r2)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r9 = r9.m117638xfb82e301()     // Catch: java.lang.Exception -> Ld6
            r0.append(r9)     // Catch: java.lang.Exception -> Ld6
            java.lang.String r9 = r0.toString()     // Catch: java.lang.Exception -> Ld6
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r8, r9)     // Catch: java.lang.Exception -> Ld6
            return
        Ld6:
            r9 = move-exception
            java.lang.String r0 = "postProcess failed"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r8, r9, r0, r7)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uv4.j.mo473xaee99e0d(long, com.tencent.wechat.aff.udr.x):void");
    }
}
