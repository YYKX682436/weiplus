package com.p314xaae8f345.mm.vfs;

/* renamed from: com.tencent.mm.vfs.AssetsSchemeResolver */
/* loaded from: classes12.dex */
public final class C22738xaf98734e extends com.p314xaae8f345.mm.vfs.AbstractC22766xe7748d96 {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.vfs.l f39785x681a0c0c = new com.p314xaae8f345.mm.vfs.l(null);

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.C22738xaf98734e.AssetsFileSystem f294225d = new com.p314xaae8f345.mm.vfs.C22738xaf98734e.AssetsFileSystem(com.p314xaae8f345.mm.vfs.a3.f294314a.f294346d);

    /* renamed from: com.tencent.mm.vfs.AssetsSchemeResolver$AssetsFileSystem */
    /* loaded from: classes12.dex */
    public static final class AssetsFileSystem extends com.p314xaae8f345.mm.vfs.a implements com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.vfs.C22738xaf98734e.AssetsFileSystem> f39786x681a0c0c = null;

        /* renamed from: e, reason: collision with root package name */
        public final android.content.res.AssetManager f294226e;

        public AssetsFileSystem(android.content.Context context) {
            this.f294226e = context.getAssets();
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.lang.Iterable C(java.lang.String str) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, false);
            try {
                java.lang.String[] list = this.f294226e.list(l17);
                if (list == null) {
                    return null;
                }
                return java.util.Arrays.asList(list);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("VFS.AssetsFileSystem", e17, "Cannot list: " + l17);
                return null;
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.lang.String D(java.lang.String str, boolean z17) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean F(java.lang.String str) {
            try {
                a(str).close();
                return true;
            } catch (java.io.IOException unused) {
                return false;
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.a
        public long G(java.lang.String str, com.p314xaae8f345.mm.vfs.q2 q2Var, java.lang.String str2, boolean z17) {
            throw new java.io.IOException("Not implemented");
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.io.InputStream a(java.lang.String str) {
            try {
                return this.f294226e.open(str);
            } catch (java.io.IOException e17) {
                if (e17 instanceof java.io.FileNotFoundException) {
                    throw ((java.io.FileNotFoundException) e17);
                }
                throw new java.io.FileNotFoundException(e17.getMessage());
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.a0
        public java.lang.Object b(java.util.Map map) {
            return this;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public java.io.OutputStream c(java.lang.String str, boolean z17) {
            throw new java.io.FileNotFoundException("Cannot open files for writing on read-only filesystems");
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean d(java.lang.String str) {
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean e(java.lang.String str, boolean z17) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public com.p314xaae8f345.mm.vfs.o2 g(java.lang.String str) {
            return null;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        /* renamed from: list */
        public java.lang.Iterable mo82286x32b09e(java.lang.String str) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, true, false);
            try {
                java.lang.String[] list = this.f294226e.list(l17);
                if (list == null) {
                    return null;
                }
                return new pm5.l(java.util.Arrays.asList(list), new com.p314xaae8f345.mm.vfs.k(this, l17.isEmpty() ? l17 : l17.concat("/")), null, false);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.e("VFS.AssetsFileSystem", e17, "Cannot list: " + l17);
                return null;
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public com.p314xaae8f345.mm.vfs.x1 m(java.lang.String str) {
            try {
                java.io.InputStream a17 = a(str);
                int available = a17.available();
                a17.close();
                int lastIndexOf = str.lastIndexOf(47);
                return new com.p314xaae8f345.mm.vfs.x1(this, str, lastIndexOf < 0 ? str : str.substring(lastIndexOf + 1), available, 0L, 0L, false);
            } catch (java.io.IOException unused) {
                return null;
            }
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean n(java.lang.String str, long j17) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public int o() {
            return 12;
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public boolean r(java.lang.String str) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.vfs.a
        /* renamed from: toString */
        public java.lang.String mo82287x9616526c() {
            return "assets";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.p314xaae8f345.mm.vfs.q2
        public com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb y() {
            return this;
        }
    }

    public C22738xaf98734e(com.p314xaae8f345.mm.vfs.j jVar) {
    }

    @Override // com.p314xaae8f345.mm.vfs.s5
    public android.util.Pair a(com.p314xaae8f345.mm.vfs.m5 m5Var, com.p314xaae8f345.mm.vfs.z7 z7Var) {
        java.lang.String str = z7Var.f294812f;
        return android.util.Pair.create(this.f294225d, str == null ? "" : com.p314xaae8f345.mm.vfs.e8.l(str, true, true));
    }
}
