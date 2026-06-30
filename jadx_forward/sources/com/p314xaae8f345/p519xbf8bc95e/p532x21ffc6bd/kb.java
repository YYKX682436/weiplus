package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kb<D extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jz> extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kg<D> implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw<D> {

    /* renamed from: a, reason: collision with root package name */
    java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> f131594a = new java.util.ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private boolean f131595b = true;

    /* renamed from: c, reason: collision with root package name */
    private int f131596c;

    public kb(int i17) {
        this.f131596c = i17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw<D> a() {
        return this;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final void b() {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().j();
                } else {
                    next.b();
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final long c() {
        long c17;
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    c17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().k();
                } else {
                    c17 = next.c();
                }
                j17 += c17;
            }
        }
        return j17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final long d() {
        long d17;
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    d17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().l();
                } else {
                    d17 = next.d();
                }
                j17 += d17;
            }
        }
        return j17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf
    public final long e() {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                j17 += next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf ? ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().e() : next.e();
            }
        }
        return j17;
    }

    private void a(boolean z17) {
        this.f131595b = z17;
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>... jyVarArr) {
        this.f131594a.addAll(java.util.Arrays.asList(jyVarArr));
    }

    public final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> a(int i17) {
        if (i17 >= this.f131594a.size()) {
            return null;
        }
        return this.f131594a.get(i17);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final void a(java.lang.String str, D d17) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131748p, str, this.f131596c);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131749q, str, "put data length", java.lang.Integer.valueOf(d17 == null ? 0 : d17.a()), this.f131596c);
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().b(str, (java.lang.String) d17);
                } else {
                    next.a(str, (java.lang.String) d17);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final void b(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) next).a().b(aVar);
                } else if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> m17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m();
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Long.valueOf(m17.k()));
                    }
                } else if (aVar != null) {
                    aVar.mo35806xf5bc2045(java.lang.Long.valueOf(next.c()));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final void c(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) next).a().c(aVar);
                } else if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> m17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m();
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Long.valueOf(m17.l()));
                    }
                } else if (aVar != null) {
                    aVar.mo35806xf5bc2045(java.lang.Long.valueOf(next.d()));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final void d(com.tencent.mapsdk.internal.jw.a<java.lang.Long> aVar) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) next).a().d(aVar);
                } else if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> m17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m();
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Long.valueOf(m17.e()));
                    }
                } else if (aVar != null) {
                    aVar.mo35806xf5bc2045(java.lang.Long.valueOf(next.e()));
                }
            }
        }
    }

    private static void a(java.lang.String str, D d17, java.util.List<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> list) {
        for (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> jyVar : list) {
            if (jyVar instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) jyVar).m().b(str, (java.lang.String) d17);
            } else {
                jyVar.a(str, (java.lang.String) d17);
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final D a(java.lang.String str, java.lang.Class<D> cls) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        D d17 = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    d17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().b(str, cls);
                } else {
                    d17 = next.a(str, cls);
                }
                if (d17 != null && d17.a() > 0) {
                    com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131739g, "从[" + next + "]缓存中获取数据成功");
                    break;
                }
                if (this.f131595b) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131748p, str, (java.lang.Object) "back to fill ".concat(java.lang.String.valueOf(next)), this.f131596c);
                    arrayList.add(next);
                }
            }
        }
        if (d17 != null && d17.a() > 0 && !arrayList.isEmpty()) {
            a(str, d17, arrayList);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131748p, str, "get data length", java.lang.Integer.valueOf(d17 == null ? 0 : d17.a()), this.f131596c);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.f(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131748p, str, this.f131596c);
        return d17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy
    public final boolean a(java.lang.String str) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        boolean z17 = true;
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    z17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().b(str);
                } else {
                    z17 = next.a(str);
                }
            }
        }
        return z17;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final void a(java.lang.String str, D d17, com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) next).a().a(str, (java.lang.String) d17, aVar);
                } else if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().b(str, (java.lang.String) d17);
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Boolean.TRUE);
                    }
                } else {
                    next.a(str, (java.lang.String) d17);
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Boolean.TRUE);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final void a(java.lang.String str, java.lang.Class<D> cls, com.tencent.mapsdk.internal.jw.a<D> aVar) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) next).a().a(str, cls, aVar);
                } else if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> m17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m();
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(m17.b(str, cls));
                    }
                } else if (aVar != null) {
                    aVar.mo35806xf5bc2045(next.a(str, cls));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final void a(java.lang.String str, com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) next).a().a(str, aVar);
                } else if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf<D> m17 = ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m();
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Boolean.valueOf(m17.b(str)));
                    }
                } else if (aVar != null) {
                    aVar.mo35806xf5bc2045(java.lang.Boolean.valueOf(next.a(str)));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw
    public final void a(com.tencent.mapsdk.internal.jw.a<java.lang.Boolean> aVar) {
        java.util.Iterator<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D>> it = this.f131594a.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jy<D> next = it.next();
            if (next != null) {
                if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.jw) next).a().a(aVar);
                } else if (next instanceof com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) {
                    ((com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kf) next).m().j();
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Boolean.TRUE);
                    }
                } else {
                    next.b();
                    if (aVar != null) {
                        aVar.mo35806xf5bc2045(java.lang.Boolean.TRUE);
                    }
                }
            }
        }
    }
}
