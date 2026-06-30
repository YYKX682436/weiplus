package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class kb<D extends com.tencent.mapsdk.internal.jz> extends com.tencent.mapsdk.internal.kg<D> implements com.tencent.mapsdk.internal.jw<D> {

    /* renamed from: a, reason: collision with root package name */
    java.util.ArrayList<com.tencent.mapsdk.internal.jy<D>> f50061a = new java.util.ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f50062b = true;

    /* renamed from: c, reason: collision with root package name */
    private int f50063c;

    public kb(int i17) {
        this.f50063c = i17;
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final com.tencent.mapsdk.internal.jw<D> a() {
        return this;
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final void b() {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.kf) {
                    ((com.tencent.mapsdk.internal.kf) next).m().j();
                } else {
                    next.b();
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final long c() {
        long c17;
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.kf) {
                    c17 = ((com.tencent.mapsdk.internal.kf) next).m().k();
                } else {
                    c17 = next.c();
                }
                j17 += c17;
            }
        }
        return j17;
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final long d() {
        long d17;
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.kf) {
                    d17 = ((com.tencent.mapsdk.internal.kf) next).m().l();
                } else {
                    d17 = next.d();
                }
                j17 += d17;
            }
        }
        return j17;
    }

    @Override // com.tencent.mapsdk.internal.jy, com.tencent.mapsdk.internal.kf
    public final long e() {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                j17 += next instanceof com.tencent.mapsdk.internal.kf ? ((com.tencent.mapsdk.internal.kf) next).m().e() : next.e();
            }
        }
        return j17;
    }

    private void a(boolean z17) {
        this.f50062b = z17;
    }

    private void a(com.tencent.mapsdk.internal.jy<D>... jyVarArr) {
        this.f50061a.addAll(java.util.Arrays.asList(jyVarArr));
    }

    public final com.tencent.mapsdk.internal.jy<D> a(int i17) {
        if (i17 >= this.f50061a.size()) {
            return null;
        }
        return this.f50061a.get(i17);
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final void a(java.lang.String str, D d17) {
        com.tencent.mapsdk.internal.lb.b(com.tencent.mapsdk.internal.kx.f50215p, str, this.f50063c);
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50216q, str, "put data length", java.lang.Integer.valueOf(d17 == null ? 0 : d17.a()), this.f50063c);
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.kf) {
                    ((com.tencent.mapsdk.internal.kf) next).m().b(str, (java.lang.String) d17);
                } else {
                    next.a(str, (java.lang.String) d17);
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void b(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.jw) {
                    ((com.tencent.mapsdk.internal.jw) next).a().b(aVar);
                } else if (next instanceof com.tencent.mapsdk.internal.kf) {
                    com.tencent.mapsdk.internal.kf<D> m17 = ((com.tencent.mapsdk.internal.kf) next).m();
                    if (aVar != null) {
                        aVar.callback(java.lang.Long.valueOf(m17.k()));
                    }
                } else if (aVar != null) {
                    aVar.callback(java.lang.Long.valueOf(next.c()));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void c(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.jw) {
                    ((com.tencent.mapsdk.internal.jw) next).a().c(aVar);
                } else if (next instanceof com.tencent.mapsdk.internal.kf) {
                    com.tencent.mapsdk.internal.kf<D> m17 = ((com.tencent.mapsdk.internal.kf) next).m();
                    if (aVar != null) {
                        aVar.callback(java.lang.Long.valueOf(m17.l()));
                    }
                } else if (aVar != null) {
                    aVar.callback(java.lang.Long.valueOf(next.d()));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void d(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.jw) {
                    ((com.tencent.mapsdk.internal.jw) next).a().d(aVar);
                } else if (next instanceof com.tencent.mapsdk.internal.kf) {
                    com.tencent.mapsdk.internal.kf<D> m17 = ((com.tencent.mapsdk.internal.kf) next).m();
                    if (aVar != null) {
                        aVar.callback(java.lang.Long.valueOf(m17.e()));
                    }
                } else if (aVar != null) {
                    aVar.callback(java.lang.Long.valueOf(next.e()));
                }
            }
        }
    }

    private static void a(java.lang.String str, D d17, java.util.List<com.tencent.mapsdk.internal.jy<D>> list) {
        for (com.tencent.mapsdk.internal.jy<D> jyVar : list) {
            if (jyVar instanceof com.tencent.mapsdk.internal.kf) {
                ((com.tencent.mapsdk.internal.kf) jyVar).m().b(str, (java.lang.String) d17);
            } else {
                jyVar.a(str, (java.lang.String) d17);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final D a(java.lang.String str, java.lang.Class<D> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        D d17 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.kf) {
                    d17 = ((com.tencent.mapsdk.internal.kf) next).m().b(str, cls);
                } else {
                    d17 = next.a(str, cls);
                }
                if (d17 != null && d17.a() > 0) {
                    com.tencent.mapsdk.core.utils.log.LogUtil.c(com.tencent.mapsdk.internal.kx.f50206g, "从[" + next + "]缓存中获取数据成功");
                    break;
                }
                if (this.f50062b) {
                    com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50215p, str, (java.lang.Object) "back to fill ".concat(java.lang.String.valueOf(next)), this.f50063c);
                    arrayList.add(next);
                }
            }
        }
        if (d17 != null && d17.a() > 0 && !arrayList.isEmpty()) {
            a(str, d17, arrayList);
        }
        com.tencent.mapsdk.internal.lb.a(com.tencent.mapsdk.internal.kx.f50215p, str, "get data length", java.lang.Integer.valueOf(d17 == null ? 0 : d17.a()), this.f50063c);
        com.tencent.mapsdk.internal.lb.f(com.tencent.mapsdk.internal.kx.f50215p, str, this.f50063c);
        return d17;
    }

    @Override // com.tencent.mapsdk.internal.jy
    public final boolean a(java.lang.String str) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.kf) {
                    z17 = ((com.tencent.mapsdk.internal.kf) next).m().b(str);
                } else {
                    z17 = next.a(str);
                }
            }
        }
        return z17;
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(java.lang.String str, D d17, com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.jw) {
                    ((com.tencent.mapsdk.internal.jw) next).a().a(str, (java.lang.String) d17, aVar);
                } else if (next instanceof com.tencent.mapsdk.internal.kf) {
                    ((com.tencent.mapsdk.internal.kf) next).m().b(str, (java.lang.String) d17);
                    if (aVar != null) {
                        aVar.callback(java.lang.Boolean.TRUE);
                    }
                } else {
                    next.a(str, (java.lang.String) d17);
                    if (aVar != null) {
                        aVar.callback(java.lang.Boolean.TRUE);
                    }
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(java.lang.String str, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jw.a<D> aVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.jw) {
                    ((com.tencent.mapsdk.internal.jw) next).a().a(str, cls, aVar);
                } else if (next instanceof com.tencent.mapsdk.internal.kf) {
                    com.tencent.mapsdk.internal.kf<D> m17 = ((com.tencent.mapsdk.internal.kf) next).m();
                    if (aVar != null) {
                        aVar.callback(m17.b(str, cls));
                    }
                } else if (aVar != null) {
                    aVar.callback(next.a(str, cls));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(java.lang.String str, com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.jw) {
                    ((com.tencent.mapsdk.internal.jw) next).a().a(str, aVar);
                } else if (next instanceof com.tencent.mapsdk.internal.kf) {
                    com.tencent.mapsdk.internal.kf<D> m17 = ((com.tencent.mapsdk.internal.kf) next).m();
                    if (aVar != null) {
                        aVar.callback(java.lang.Boolean.valueOf(m17.b(str)));
                    }
                } else if (aVar != null) {
                    aVar.callback(java.lang.Boolean.valueOf(next.a(str)));
                }
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.jw
    public final void a(com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        java.util.Iterator<com.tencent.mapsdk.internal.jy<D>> it = this.f50061a.iterator();
        while (it.hasNext()) {
            com.tencent.mapsdk.internal.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.tencent.mapsdk.internal.jw) {
                    ((com.tencent.mapsdk.internal.jw) next).a().a(aVar);
                } else if (next instanceof com.tencent.mapsdk.internal.kf) {
                    ((com.tencent.mapsdk.internal.kf) next).m().j();
                    if (aVar != null) {
                        aVar.callback(java.lang.Boolean.TRUE);
                    }
                } else {
                    next.b();
                    if (aVar != null) {
                        aVar.callback(java.lang.Boolean.TRUE);
                    }
                }
            }
        }
    }
}
