package f7;

/* loaded from: classes13.dex */
public class d implements t6.n {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f341558a;

    public d(android.content.Context context) {
        this.f341558a = context.getApplicationContext();
    }

    @Override // t6.n
    public boolean b(java.lang.Object obj, t6.l lVar) {
        return ((android.net.Uri) obj).getScheme().equals("android.resource");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    @Override // t6.n
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w6.z0 a(android.net.Uri r5, int r6, int r7, t6.l r8) {
        /*
            r4 = this;
            java.lang.String r6 = r5.getAuthority()
            android.content.Context r7 = r4.f341558a
            java.lang.String r8 = r7.getPackageName()
            boolean r8 = r6.equals(r8)
            r0 = 0
            if (r8 == 0) goto L12
            goto L22
        L12:
            android.content.Context r6 = r7.createPackageContext(r6, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L17
            goto L23
        L17:
            r8 = move-exception
            java.lang.String r1 = r7.getPackageName()
            boolean r6 = r6.contains(r1)
            if (r6 == 0) goto Lb6
        L22:
            r6 = r7
        L23:
            java.util.List r8 = r5.getPathSegments()
            int r1 = r8.size()
            r2 = 2
            r3 = 1
            if (r1 != r2) goto L6e
            java.util.List r8 = r5.getPathSegments()
            java.lang.String r1 = r5.getAuthority()
            java.lang.Object r0 = r8.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r8 = r8.get(r3)
            java.lang.String r8 = (java.lang.String) r8
            android.content.res.Resources r2 = r6.getResources()
            int r1 = r2.getIdentifier(r8, r0, r1)
            if (r1 != 0) goto L57
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            java.lang.String r2 = "android"
            int r1 = r1.getIdentifier(r8, r0, r2)
        L57:
            if (r1 == 0) goto L5a
            goto L84
        L5a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to find resource id for: "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L6e:
            int r8 = r8.size()
            java.lang.String r1 = "Unrecognized Uri format: "
            if (r8 != r3) goto La4
            java.util.List r8 = r5.getPathSegments()
            java.lang.Object r8 = r8.get(r0)     // Catch: java.lang.NumberFormatException -> L91
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.NumberFormatException -> L91
            int r1 = java.lang.Integer.parseInt(r8)     // Catch: java.lang.NumberFormatException -> L91
        L84:
            r5 = 0
            android.graphics.drawable.Drawable r6 = f7.a.a(r7, r6, r1, r5)
            if (r6 == 0) goto L90
            f7.c r5 = new f7.c
            r5.<init>(r6)
        L90:
            return r5
        L91:
            r6 = move-exception
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r1)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
            r7.<init>(r5, r6)
            throw r7
        La4:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r1)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        Lb6:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Failed to obtain context or unrecognized Uri format for: "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5, r8)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f7.d.a(android.net.Uri, int, int, t6.l):w6.z0");
    }
}
