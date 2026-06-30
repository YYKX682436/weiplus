package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f88994a;

    public b0() {
        java.util.EnumMap enumMap = new java.util.EnumMap(com.tencent.mm.plugin.appbrand.task.x0.class);
        this.f88994a = enumMap;
        com.tencent.mm.plugin.appbrand.task.x0 x0Var = com.tencent.mm.plugin.appbrand.task.x0.WASERVICE;
        com.tencent.mm.plugin.appbrand.task.e0 e0Var = com.tencent.mm.plugin.appbrand.task.e0.NOT_PRELOAD;
        enumMap.put((java.util.EnumMap) x0Var, (com.tencent.mm.plugin.appbrand.task.x0) new com.tencent.mm.plugin.appbrand.task.c0(2, e0Var));
        enumMap.put((java.util.EnumMap) com.tencent.mm.plugin.appbrand.task.x0.WAGAME, (com.tencent.mm.plugin.appbrand.task.x0) new com.tencent.mm.plugin.appbrand.task.c0(2, e0Var));
    }

    public com.tencent.mm.plugin.appbrand.task.e0 a(com.tencent.mm.plugin.appbrand.task.x0 x0Var) {
        com.tencent.mm.plugin.appbrand.task.c0 c0Var = (com.tencent.mm.plugin.appbrand.task.c0) ((java.util.EnumMap) this.f88994a).get(x0Var);
        if (c0Var != null) {
            return c0Var.f88996b;
        }
        return null;
    }

    public void b(com.tencent.mm.plugin.appbrand.task.x0 x0Var, int i17, com.tencent.mm.plugin.appbrand.task.e0 e0Var) {
        ((java.util.EnumMap) this.f88994a).put((java.util.EnumMap) x0Var, (com.tencent.mm.plugin.appbrand.task.x0) new com.tencent.mm.plugin.appbrand.task.c0(i17, e0Var));
    }

    public void c(com.tencent.mm.plugin.appbrand.task.x0 x0Var, com.tencent.mm.plugin.appbrand.task.e0 e0Var) {
        java.util.Map map = this.f88994a;
        com.tencent.mm.plugin.appbrand.task.c0 c0Var = (com.tencent.mm.plugin.appbrand.task.c0) ((java.util.EnumMap) map).get(x0Var);
        ((java.util.EnumMap) map).put((java.util.EnumMap) x0Var, (com.tencent.mm.plugin.appbrand.task.x0) new com.tencent.mm.plugin.appbrand.task.c0((c0Var == null || com.tencent.mm.plugin.appbrand.task.e0.NOT_PRELOAD == e0Var) ? 2 : c0Var.f88995a, e0Var));
    }
}
