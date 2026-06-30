package c43;

/* loaded from: classes15.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f38433a = new java.util.ArrayList();

    public final void a(android.content.Context context, java.util.List tplBlockList, boolean z17, c43.f1 f1Var) {
        java.util.List list;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tplBlockList, "tplBlockList");
        if (com.tencent.mm.sdk.platformtools.t8.L0(tplBlockList)) {
            return;
        }
        java.util.LinkedList<c43.b1> linkedList = new java.util.LinkedList();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = tplBlockList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.f38433a;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.plugin.game.autogen.chatroom.TplBlock tplBlock = (com.tencent.mm.plugin.game.autogen.chatroom.TplBlock) it.next();
            java.lang.String str = tplBlock.username;
            if (str != null) {
                ((java.util.ArrayList) list).add(str);
            }
            int i17 = tplBlock.type;
            if (i17 == 0) {
                java.lang.String str2 = tplBlock.content;
                if (str2 != null) {
                    stringBuffer.append(str2);
                }
            } else if (i17 != 1) {
                if (i17 == 2) {
                    java.lang.String str3 = tplBlock.username;
                    if (str3 != null) {
                        u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(str3);
                        if (Bi != null) {
                            stringBuffer.append(((y33.e) Bi).field_nickName);
                        } else {
                            stringBuffer.append(tplBlock.content);
                        }
                    } else {
                        stringBuffer.append(tplBlock.content);
                    }
                }
            } else if (tplBlock.content != null) {
                c43.b1 b1Var = new c43.b1(0, 0, null, null, false, 31, null);
                b1Var.f38395a = stringBuffer.length();
                b1Var.f38396b = stringBuffer.length() + tplBlock.content.length();
                b1Var.f38397c = tplBlock.jump_info;
                b1Var.f38398d = tplBlock.username;
                b1Var.f38399e = tplBlock.can_be_at;
                linkedList.add(b1Var);
                stringBuffer.append(tplBlock.content);
            }
        }
        if (stringBuffer.length() == 0) {
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(stringBuffer);
        for (c43.b1 b1Var2 : linkedList) {
            spannableStringBuilder.setSpan(new c43.g1(b1Var2, z17, context, f1Var), b1Var2.f38395a, b1Var2.f38396b, 33);
        }
        if (f1Var != null) {
            f1Var.a(spannableStringBuilder);
        }
        ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Ai(list, null);
    }
}
