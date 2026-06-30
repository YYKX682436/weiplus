package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class j5 {
    public j5(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.mj_template.sns.compose.widget.k5 a(java.lang.String dataId) {
        kotlin.jvm.internal.o.g(dataId, "dataId");
        return (com.tencent.mm.mj_template.sns.compose.widget.k5) com.tencent.mm.mj_template.sns.compose.widget.k5.f70027o.get(dataId);
    }

    public final com.tencent.mm.mj_template.sns.compose.widget.k5 b(com.tencent.maas.model.MJTemplateInfo template, com.tencent.mm.mj_template.sns.compose.widget.z4 creator) {
        kotlin.jvm.internal.o.g(template, "template");
        kotlin.jvm.internal.o.g(creator, "creator");
        java.lang.String templateID = template.getTemplateID();
        android.util.ArrayMap arrayMap = com.tencent.mm.mj_template.sns.compose.widget.k5.f70027o;
        if (!arrayMap.containsKey(templateID)) {
            arrayMap.put(templateID, creator.a(template));
        }
        java.lang.Object obj = arrayMap.get(templateID);
        kotlin.jvm.internal.o.d(obj);
        return (com.tencent.mm.mj_template.sns.compose.widget.k5) obj;
    }

    public final com.tencent.mm.mj_template.sns.compose.widget.k5 c(r45.rz6 template) {
        kotlin.jvm.internal.o.g(template, "template");
        java.lang.String str = template.f385320d;
        if (str == null) {
            str = "";
        }
        r45.b70 b70Var = template.f385323g;
        java.lang.String str2 = b70Var != null ? b70Var.f370582d : null;
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = b70Var != null ? b70Var.f370585g : null;
        java.lang.String str4 = str3 == null ? "" : str3;
        r45.xy6 xy6Var = template.f385330q;
        long j17 = xy6Var != null ? xy6Var.f390599d : 0;
        long j18 = xy6Var != null ? xy6Var.f390601f : 0;
        java.lang.String str5 = template.f385335v;
        com.tencent.mm.protobuf.g gVar = template.f385334u;
        android.util.ArrayMap arrayMap = com.tencent.mm.mj_template.sns.compose.widget.k5.f70027o;
        if (!arrayMap.containsKey(str)) {
            arrayMap.put(str, new com.tencent.mm.mj_template.sns.compose.widget.k5(str, str2, str4, j17, j18, gVar, null, str5, null, com.tencent.mapsdk.internal.km.f50100e, null));
        }
        java.lang.Object obj = arrayMap.get(str);
        kotlin.jvm.internal.o.d(obj);
        return (com.tencent.mm.mj_template.sns.compose.widget.k5) obj;
    }
}
