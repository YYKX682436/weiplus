package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.a0[] f294523a;

    public i1(com.p314xaae8f345.mm.vfs.a0... a0VarArr) {
        com.p314xaae8f345.mm.vfs.a0[] a0VarArr2 = new com.p314xaae8f345.mm.vfs.a0[a0VarArr.length];
        this.f294523a = a0VarArr2;
        java.lang.System.arraycopy(a0VarArr, 0, a0VarArr2, 0, a0VarArr.length);
        for (com.p314xaae8f345.mm.vfs.a0 a0Var : a0VarArr2) {
            if (!(a0Var instanceof com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) && !(a0Var instanceof com.p314xaae8f345.mm.vfs.h1)) {
                throw new java.lang.IllegalArgumentException("Invalid type of FileSystem: " + a0Var.getClass());
            }
        }
    }

    public java.util.List a(java.util.Map map) {
        com.p314xaae8f345.mm.vfs.a0[] a0VarArr = this.f294523a;
        java.util.ArrayList arrayList = new java.util.ArrayList(a0VarArr.length);
        for (com.p314xaae8f345.mm.vfs.a0 a0Var : a0VarArr) {
            if (a0Var instanceof com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) {
                com.p314xaae8f345.mm.vfs.q2 q2Var = (com.p314xaae8f345.mm.vfs.q2) ((com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) a0Var).b(map);
                if (q2Var != com.p314xaae8f345.mm.vfs.C22759xc55eb7d2.f()) {
                    arrayList.add(q2Var);
                }
            } else if (a0Var instanceof com.p314xaae8f345.mm.vfs.h1) {
                java.util.Iterator it = ((com.p314xaae8f345.mm.vfs.h1) a0Var).b(map).iterator();
                while (it.hasNext()) {
                    arrayList.add((com.p314xaae8f345.mm.vfs.q2) it.next());
                }
            }
        }
        return arrayList;
    }

    public void b(android.os.Parcel parcel) {
        com.p314xaae8f345.mm.vfs.a0[] a0VarArr = this.f294523a;
        parcel.writeInt(a0VarArr.length);
        for (com.p314xaae8f345.mm.vfs.a0 a0Var : a0VarArr) {
            if (a0Var instanceof com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) {
                parcel.writeByte((byte) 0);
                parcel.writeParcelable((com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) a0Var, 0);
            } else if (a0Var instanceof com.p314xaae8f345.mm.vfs.h1) {
                parcel.writeByte((byte) 1);
                ((com.p314xaae8f345.mm.vfs.h1) a0Var).d(parcel);
            }
        }
    }

    /* renamed from: equals */
    public boolean m82408xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.vfs.i1) {
            if (java.util.Arrays.equals(this.f294523a, ((com.p314xaae8f345.mm.vfs.i1) obj).f294523a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m82409x8cdac1b() {
        return com.p314xaae8f345.mm.vfs.i1.class.hashCode() ^ java.util.Arrays.hashCode(this.f294523a);
    }

    /* renamed from: toString */
    public java.lang.String m82410x9616526c() {
        return java.util.Arrays.toString(this.f294523a);
    }

    public i1(java.util.Collection collection) {
        com.p314xaae8f345.mm.vfs.a0[] a0VarArr = (com.p314xaae8f345.mm.vfs.a0[]) collection.toArray(new com.p314xaae8f345.mm.vfs.a0[0]);
        this.f294523a = a0VarArr;
        for (com.p314xaae8f345.mm.vfs.a0 a0Var : a0VarArr) {
            if (!(a0Var instanceof com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb) && !(a0Var instanceof com.p314xaae8f345.mm.vfs.h1)) {
                throw new java.lang.IllegalArgumentException("Invalid type of FileSystem: " + a0Var.getClass());
            }
        }
    }

    public i1(android.os.Parcel parcel) {
        int readInt = parcel.readInt();
        this.f294523a = new com.p314xaae8f345.mm.vfs.a0[readInt];
        for (int i17 = 0; i17 < readInt; i17++) {
            byte readByte = parcel.readByte();
            if (readByte == 0) {
                this.f294523a[i17] = (com.p314xaae8f345.mm.vfs.a0) parcel.readParcelable(com.p314xaae8f345.mm.vfs.i1.class.getClassLoader());
            } else if (readByte == 1) {
                this.f294523a[i17] = new com.p314xaae8f345.mm.vfs.h1(parcel);
            }
        }
    }
}
