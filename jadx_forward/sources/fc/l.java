package fc;

/* loaded from: classes16.dex */
public class l extends fc.s implements java.util.Set {
    @Override // java.util.Set, java.util.Collection
    public boolean add(java.lang.Object obj) {
        int s17 = s(obj);
        if (s17 < 0) {
            return false;
        }
        java.lang.Object[] objArr = this.f342461i;
        java.lang.Object obj2 = objArr[s17];
        objArr[s17] = obj;
        j(obj2 == null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(java.util.Collection collection) {
        int size = collection.size();
        h(size);
        java.util.Iterator it = collection.iterator();
        boolean z17 = false;
        while (true) {
            int i17 = size - 1;
            if (size <= 0) {
                return z17;
            }
            if (add(it.next())) {
                z17 = true;
            }
            size = i17;
        }
    }

    @Override // fc.b, java.util.Map
    public void clear() {
        super.clear();
        java.lang.Object[] objArr = this.f342461i;
        int length = objArr.length;
        while (true) {
            int i17 = length - 1;
            if (length <= 0) {
                return;
            }
            objArr[i17] = null;
            length = i17;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(java.util.Collection collection) {
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!m129326xde2d761f(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.f342433d) {
            return false;
        }
        return containsAll(set);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        java.lang.Object[] objArr = this.f342461i;
        int length = objArr.length;
        int i17 = 0;
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return i17;
            }
            java.lang.Object obj = objArr[i18];
            if (obj != null && obj != fc.s.f342459n) {
                i17 += ((fc.s) this.f342462m).o(obj);
            }
            length = i18;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new fc.t(this);
    }

    @Override // fc.b
    public void k(int i17) {
        java.lang.Object[] objArr = this.f342461i;
        int length = objArr.length;
        this.f342461i = new java.lang.Object[i17];
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return;
            }
            java.lang.Object obj = objArr[i18];
            if (obj != null && obj != fc.s.f342459n) {
                int s17 = s(obj);
                if (s17 < 0) {
                    t(this.f342461i[(-s17) - 1], obj);
                    throw null;
                }
                this.f342461i[s17] = obj;
            }
            length = i18;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(java.lang.Object obj) {
        int r17 = r(obj);
        if (r17 < 0) {
            return false;
        }
        l(r17);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(java.util.Collection collection) {
        int size = collection.size();
        java.util.Iterator it = collection.iterator();
        boolean z17 = false;
        while (true) {
            int i17 = size - 1;
            if (size <= 0) {
                return z17;
            }
            if (remove(it.next())) {
                z17 = true;
            }
            size = i17;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        int i17 = this.f342433d;
        fc.t tVar = new fc.t(this);
        boolean z17 = false;
        while (true) {
            int i18 = i17 - 1;
            if (i17 <= 0) {
                return z17;
            }
            if (!collection.contains(tVar.next())) {
                tVar.m129322xc84af884();
                z17 = true;
            }
            i17 = i18;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray() {
        java.lang.Object[] objArr = new java.lang.Object[this.f342433d];
        java.lang.Object[] objArr2 = this.f342461i;
        int length = objArr2.length;
        int i17 = 0;
        while (true) {
            int i18 = length - 1;
            if (length <= 0) {
                return objArr;
            }
            java.lang.Object obj = objArr2[i18];
            if (obj != null && obj != fc.s.f342459n) {
                objArr[i17] = obj;
                i17++;
            }
            length = i18;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public java.lang.Object[] toArray(java.lang.Object[] objArr) {
        int i17;
        java.lang.Object obj;
        int i18 = this.f342433d;
        if (objArr.length < i18) {
            objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(objArr.getClass().getComponentType(), i18);
        }
        int i19 = this.f342433d;
        int d17 = d();
        int i27 = 0;
        while (i27 < i18) {
            if (i19 == this.f342433d) {
                java.lang.Object[] objArr2 = this.f342461i;
                while (true) {
                    i17 = d17 - 1;
                    if (d17 <= 0 || !((obj = objArr2[i17]) == null || obj == fc.s.f342459n)) {
                        break;
                    }
                    d17 = i17;
                }
                if (i17 >= 0) {
                    objArr[i27] = this.f342461i[i17];
                    i27++;
                    d17 = i17;
                } else {
                    throw new java.util.NoSuchElementException();
                }
            } else {
                throw new java.util.ConcurrentModificationException();
            }
        }
        if (objArr.length > i18) {
            objArr[i18] = null;
        }
        return objArr;
    }
}
