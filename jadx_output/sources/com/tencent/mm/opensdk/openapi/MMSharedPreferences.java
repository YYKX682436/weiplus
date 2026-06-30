package com.tencent.mm.opensdk.openapi;

/* loaded from: classes8.dex */
class MMSharedPreferences implements android.content.SharedPreferences {
    private static final java.lang.String TAG = "MicroMsg.SDK.SharedPreferences";

    /* renamed from: cr, reason: collision with root package name */
    private final android.content.ContentResolver f72356cr;
    private final java.lang.String[] columns = {"_id", "key", "type", "value"};
    private final java.util.HashMap<java.lang.String, java.lang.Object> values = new java.util.HashMap<>();
    private com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor editor = null;

    /* loaded from: classes8.dex */
    public static class REditor implements android.content.SharedPreferences.Editor {

        /* renamed from: cr, reason: collision with root package name */
        private android.content.ContentResolver f72357cr;
        private java.util.Map<java.lang.String, java.lang.Object> values = new java.util.HashMap();
        private java.util.Set<java.lang.String> remove = new java.util.HashSet();
        private boolean clear = false;

        public REditor(android.content.ContentResolver contentResolver) {
            this.f72357cr = contentResolver;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor clear() {
            this.clear = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00b1 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
        @Override // android.content.SharedPreferences.Editor
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean commit() {
            /*
                r10 = this;
                android.content.ContentValues r0 = new android.content.ContentValues
                r0.<init>()
                boolean r1 = r10.clear
                r2 = 0
                if (r1 == 0) goto L14
                android.content.ContentResolver r1 = r10.f72357cr
                android.net.Uri r3 = com.tencent.mm.opensdk.utils.c.b.CONTENT_URI
                r4 = 0
                r1.delete(r3, r4, r4)
                r10.clear = r2
            L14:
                java.util.Set<java.lang.String> r1 = r10.remove
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r3 = r1.hasNext()
                java.lang.String r4 = "key = ?"
                if (r3 == 0) goto L34
                java.lang.Object r3 = r1.next()
                java.lang.String r3 = (java.lang.String) r3
                android.content.ContentResolver r5 = r10.f72357cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.c.b.CONTENT_URI
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.delete(r6, r4, r3)
                goto L1a
            L34:
                java.util.Map<java.lang.String, java.lang.Object> r1 = r10.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L3e:
                boolean r3 = r1.hasNext()
                r5 = 1
                if (r3 == 0) goto Lc4
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r6 = r3.getValue()
                java.lang.String r7 = "MicroMsg.SDK.PluginProvider.Resolver"
                if (r6 != 0) goto L5b
                java.lang.String r8 = "unresolve failed, null value"
            L56:
                com.tencent.mm.opensdk.utils.Log.e(r7, r8)
                r7 = r2
                goto L97
            L5b:
                boolean r8 = r6 instanceof java.lang.Integer
                if (r8 == 0) goto L61
                r7 = r5
                goto L97
            L61:
                boolean r8 = r6 instanceof java.lang.Long
                if (r8 == 0) goto L67
                r7 = 2
                goto L97
            L67:
                boolean r8 = r6 instanceof java.lang.String
                if (r8 == 0) goto L6d
                r7 = 3
                goto L97
            L6d:
                boolean r8 = r6 instanceof java.lang.Boolean
                if (r8 == 0) goto L73
                r7 = 4
                goto L97
            L73:
                boolean r8 = r6 instanceof java.lang.Float
                if (r8 == 0) goto L79
                r7 = 5
                goto L97
            L79:
                boolean r8 = r6 instanceof java.lang.Double
                if (r8 == 0) goto L7f
                r7 = 6
                goto L97
            L7f:
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                java.lang.String r9 = "unresolve failed, unknown type="
                r8.<init>(r9)
                java.lang.Class r9 = r6.getClass()
                java.lang.String r9 = r9.toString()
                r8.append(r9)
                java.lang.String r8 = r8.toString()
                goto L56
            L97:
                if (r7 != 0) goto L9b
                r5 = r2
                goto Laf
            L9b:
                java.lang.String r8 = "type"
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r0.put(r8, r7)
                java.lang.String r7 = "value"
                java.lang.String r6 = r6.toString()
                r0.put(r7, r6)
            Laf:
                if (r5 == 0) goto L3e
                android.content.ContentResolver r5 = r10.f72357cr
                android.net.Uri r6 = com.tencent.mm.opensdk.utils.c.b.CONTENT_URI
                java.lang.Object r3 = r3.getKey()
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String[] r3 = new java.lang.String[]{r3}
                r5.update(r6, r0, r4, r3)
                goto L3e
            Lc4:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor.commit():boolean");
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
            this.values.put(str, java.lang.Boolean.valueOf(z17));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
            this.values.put(str, java.lang.Float.valueOf(f17));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
            this.values.put(str, java.lang.Integer.valueOf(i17));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
            this.values.put(str, java.lang.Long.valueOf(j17));
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
            this.values.put(str, str2);
            this.remove.remove(str);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
            return null;
        }

        @Override // android.content.SharedPreferences.Editor
        public android.content.SharedPreferences.Editor remove(java.lang.String str) {
            this.remove.add(str);
            return this;
        }
    }

    public MMSharedPreferences(android.content.Context context) {
        this.f72356cr = context.getContentResolver();
    }

    private java.lang.Object getValue(java.lang.String str) {
        try {
            android.database.Cursor query = this.f72356cr.query(com.tencent.mm.opensdk.utils.c.b.CONTENT_URI, this.columns, "key = ?", new java.lang.String[]{str}, null);
            if (query == null) {
                return null;
            }
            java.lang.Object a17 = query.moveToFirst() ? com.tencent.mm.opensdk.utils.c.a.a(query.getInt(query.getColumnIndex("type")), query.getString(query.getColumnIndex("value"))) : null;
            query.close();
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "getValue exception:" + e17.getMessage());
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        return getValue(str) != null;
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        if (this.editor == null) {
            this.editor = new com.tencent.mm.opensdk.openapi.MMSharedPreferences.REditor(this.f72356cr);
        }
        return this.editor;
    }

    @Override // android.content.SharedPreferences
    public java.util.Map<java.lang.String, ?> getAll() {
        try {
            android.database.Cursor query = this.f72356cr.query(com.tencent.mm.opensdk.utils.c.b.CONTENT_URI, this.columns, null, null, null);
            if (query == null) {
                return null;
            }
            int columnIndex = query.getColumnIndex("key");
            int columnIndex2 = query.getColumnIndex("type");
            int columnIndex3 = query.getColumnIndex("value");
            while (query.moveToNext()) {
                this.values.put(query.getString(columnIndex), com.tencent.mm.opensdk.utils.c.a.a(query.getInt(columnIndex2), query.getString(columnIndex3)));
            }
            query.close();
            return this.values;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.opensdk.utils.Log.e(TAG, "getAll exception:" + e17.getMessage());
            return this.values;
        }
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        java.lang.Object value = getValue(str);
        return (value == null || !(value instanceof java.lang.Boolean)) ? z17 : ((java.lang.Boolean) value).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        java.lang.Object value = getValue(str);
        return (value == null || !(value instanceof java.lang.Float)) ? f17 : ((java.lang.Float) value).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        java.lang.Object value = getValue(str);
        return (value == null || !(value instanceof java.lang.Integer)) ? i17 : ((java.lang.Integer) value).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        java.lang.Object value = getValue(str);
        return (value == null || !(value instanceof java.lang.Long)) ? j17 : ((java.lang.Long) value).longValue();
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        java.lang.Object value = getValue(str);
        return (value == null || !(value instanceof java.lang.String)) ? str2 : (java.lang.String) value;
    }

    @Override // android.content.SharedPreferences
    public java.util.Set<java.lang.String> getStringSet(java.lang.String str, java.util.Set<java.lang.String> set) {
        return null;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
