package androidx.appcompat.widget;

/* loaded from: classes13.dex */
public class k2 extends r3.f implements android.view.View.OnClickListener {
    public static final /* synthetic */ int E = 0;
    public int A;
    public int B;
    public int C;
    public int D;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.appcompat.widget.SearchView f9628r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.SearchableInfo f9629s;

    /* renamed from: t, reason: collision with root package name */
    public final android.content.Context f9630t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.WeakHashMap f9631u;

    /* renamed from: v, reason: collision with root package name */
    public final int f9632v;

    /* renamed from: w, reason: collision with root package name */
    public int f9633w;

    /* renamed from: x, reason: collision with root package name */
    public android.content.res.ColorStateList f9634x;

    /* renamed from: y, reason: collision with root package name */
    public int f9635y;

    /* renamed from: z, reason: collision with root package name */
    public int f9636z;

    public k2(android.content.Context context, androidx.appcompat.widget.SearchView searchView, android.app.SearchableInfo searchableInfo, java.util.WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f9633w = 1;
        this.f9635y = -1;
        this.f9636z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = -1;
        this.f9628r = searchView;
        this.f9629s = searchableInfo;
        this.f9632v = searchView.getSuggestionCommitIconResId();
        this.f9630t = context;
        this.f9631u = weakHashMap;
    }

    public static java.lang.String k(android.database.Cursor cursor, int i17) {
        if (i17 == -1) {
            return null;
        }
        try {
            return cursor.getString(i17);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0125  */
    @Override // r3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.View r21, android.content.Context r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k2.a(android.view.View, android.content.Context, android.database.Cursor):void");
    }

    @Override // r3.c
    public void c(android.database.Cursor cursor) {
        try {
            super.c(cursor);
            if (cursor != null) {
                this.f9635y = cursor.getColumnIndex("suggest_text_1");
                this.f9636z = cursor.getColumnIndex("suggest_text_2");
                this.A = cursor.getColumnIndex("suggest_text_2_url");
                this.B = cursor.getColumnIndex("suggest_icon_1");
                this.C = cursor.getColumnIndex("suggest_icon_2");
                this.D = cursor.getColumnIndex("suggest_flags");
            }
        } catch (java.lang.Exception unused) {
        }
    }

    @Override // r3.c
    public java.lang.CharSequence d(android.database.Cursor cursor) {
        java.lang.String k17;
        java.lang.String k18;
        if (cursor == null) {
            return null;
        }
        java.lang.String k19 = k(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (k19 != null) {
            return k19;
        }
        android.app.SearchableInfo searchableInfo = this.f9629s;
        if (searchableInfo.shouldRewriteQueryFromData() && (k18 = k(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return k18;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (k17 = k(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return k17;
    }

    @Override // r3.c
    public android.view.View f(android.content.Context context, android.database.Cursor cursor, android.view.ViewGroup viewGroup) {
        android.view.View inflate = this.f368936q.inflate(this.f368934o, viewGroup, false);
        inflate.setTag(new androidx.appcompat.widget.j2(inflate));
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d6o)).setImageResource(this.f9632v);
        return inflate;
    }

    public android.graphics.drawable.Drawable g(android.net.Uri uri) {
        int parseInt;
        java.lang.String authority = uri.getAuthority();
        if (android.text.TextUtils.isEmpty(authority)) {
            throw new java.io.FileNotFoundException("No authority: " + uri);
        }
        try {
            android.content.res.Resources resourcesForApplication = this.f368928g.getPackageManager().getResourcesForApplication(authority);
            java.util.List<java.lang.String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new java.io.FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    parseInt = java.lang.Integer.parseInt(pathSegments.get(0));
                } catch (java.lang.NumberFormatException unused) {
                    throw new java.io.FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new java.io.FileNotFoundException("More than two path segments: " + uri);
                }
                parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (parseInt != 0) {
                return resourcesForApplication.getDrawable(parseInt);
            }
            throw new java.io.FileNotFoundException("No resource found for: " + uri);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused2) {
            throw new java.io.FileNotFoundException("No package found for authority: " + uri);
        }
    }

    @Override // r3.c, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i17, view, viewGroup);
        } catch (java.lang.RuntimeException e17) {
            android.view.View inflate = this.f368936q.inflate(this.f368935p, viewGroup, false);
            if (inflate != null) {
                ((androidx.appcompat.widget.j2) inflate.getTag()).f9617a.setText(e17.toString());
            }
            return inflate;
        }
    }

    @Override // r3.c, android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        try {
            return super.getView(i17, view, viewGroup);
        } catch (java.lang.RuntimeException e17) {
            android.view.View f17 = f(this.f368928g, this.f368927f, viewGroup);
            ((androidx.appcompat.widget.j2) f17.getTag()).f9617a.setText(e17.toString());
            return f17;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable h(java.lang.String r9) {
        /*
            r8 = this;
            java.util.WeakHashMap r0 = r8.f9631u
            android.content.Context r1 = r8.f9630t
            java.lang.String r2 = "android.resource://"
            r3 = 0
            if (r9 == 0) goto Ld4
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto Ld4
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L19
            goto Ld4
        L19:
            int r4 = java.lang.Integer.parseInt(r9)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r1.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r5.toString()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.Object r5 = r0.get(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r5 != 0) goto L3f
            r5 = r3
            goto L43
        L3f:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            android.graphics.drawable.Drawable r4 = b3.l.getDrawable(r1, r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r4 == 0) goto L53
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r0.put(r2, r5)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L53:
            return r4
        L54:
            return r3
        L55:
            java.lang.Object r2 = r0.get(r9)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L5f
            r2 = r3
            goto L63
        L5f:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L63:
            if (r2 == 0) goto L66
            return r2
        L66:
            android.net.Uri r2 = android.net.Uri.parse(r9)
            java.lang.String r4 = "Failed to open "
            java.lang.String r5 = "Resource does not exist: "
            java.lang.String r6 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r7 = "android.resource"
            boolean r6 = r7.equals(r6)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r6 == 0) goto L92
            android.graphics.drawable.Drawable r1 = r8.g(r2)     // Catch: android.content.res.Resources.NotFoundException -> L80 java.io.FileNotFoundException -> Lc4
            r3 = r1
            goto Lcb
        L80:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc4
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> Lc4
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> Lc4
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            throw r1     // Catch: java.io.FileNotFoundException -> Lc4
        L92:
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> Lc4
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            if (r1 == 0) goto Lb2
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r1, r3)     // Catch: java.lang.Throwable -> La9
            r1.close()     // Catch: java.io.IOException -> La4
            goto La7
        La4:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc4
        La7:
            r3 = r4
            goto Lcb
        La9:
            r4 = move-exception
            r1.close()     // Catch: java.io.IOException -> Lae
            goto Lb1
        Lae:
            r2.toString()     // Catch: java.io.FileNotFoundException -> Lc4
        Lb1:
            throw r4     // Catch: java.io.FileNotFoundException -> Lc4
        Lb2:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Lc4
            r5.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            r5.append(r2)     // Catch: java.io.FileNotFoundException -> Lc4
            java.lang.String r4 = r5.toString()     // Catch: java.io.FileNotFoundException -> Lc4
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Lc4
            throw r1     // Catch: java.io.FileNotFoundException -> Lc4
        Lc4:
            r1 = move-exception
            java.util.Objects.toString(r2)
            r1.getMessage()
        Lcb:
            if (r3 == 0) goto Ld4
            android.graphics.drawable.Drawable$ConstantState r1 = r3.getConstantState()
            r0.put(r9, r1)
        Ld4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k2.h(java.lang.String):android.graphics.drawable.Drawable");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    public android.database.Cursor j(android.app.SearchableInfo searchableInfo, java.lang.String str, int i17) {
        java.lang.String suggestAuthority;
        java.lang.String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        android.net.Uri.Builder fragment = new android.net.Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        java.lang.String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        java.lang.String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new java.lang.String[]{str};
        } else {
            fragment.appendPath(str);
        }
        java.lang.String[] strArr2 = strArr;
        if (i17 > 0) {
            fragment.appendQueryParameter("limit", java.lang.String.valueOf(i17));
        }
        return this.f368928g.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        android.database.Cursor cursor = this.f368927f;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        android.database.Cursor cursor = this.f368927f;
        android.os.Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.Object tag = view.getTag();
        if (tag instanceof java.lang.CharSequence) {
            this.f9628r.q((java.lang.CharSequence) tag);
        }
    }
}
