package bg4;

/* loaded from: classes9.dex */
public class o extends com.tencent.mm.sdk.event.n {
    public o() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        java.lang.String str;
        com.tencent.mm.autogen.events.VoiceReminderRemindEvent voiceReminderRemindEvent = (com.tencent.mm.autogen.events.VoiceReminderRemindEvent) iEvent;
        zf4.o a17 = zf4.o.a(voiceReminderRemindEvent.f54939g.f7857a);
        am.s00 s00Var = voiceReminderRemindEvent.f54939g;
        com.tencent.mm.storage.f9 f9Var = s00Var.f7859c;
        if (a17 != null) {
            zf4.l wi6 = zf4.l.wi();
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String str2 = s00Var.f7858b;
            java.lang.String h17 = k35.m1.h(com.tencent.mm.sdk.platformtools.x2.f193071a, a17.f472682a);
            if (h17 == null || h17.length() <= 0) {
                str = "";
            } else {
                java.lang.String[] split = h17.split(";");
                str = "" + split[0];
                if (split.length > 1) {
                    str = str + split[1];
                }
            }
            if (str2 != null) {
                str = str + str2;
            }
            long createTime = f9Var.getCreateTime();
            wi6.getClass();
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (context != null) {
                try {
                    boolean i17 = ip.b.i();
                    boolean b17 = ip.b.b();
                    if (!com.tencent.mm.storage.z3.I4(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b)) {
                        if (i17) {
                            com.tencent.mm.sdk.platformtools.t8.L1(context, true);
                        }
                        if (b17) {
                            android.util.Pair i18 = ip.l.i();
                            wi6.Di(context, (java.lang.String) i18.second, ((java.lang.Boolean) i18.first).booleanValue());
                        }
                    } else if (i17) {
                        com.tencent.mm.sdk.platformtools.t8.L1(context, true);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", e17, "", new java.lang.Object[0]);
                }
                java.util.Set set = wi6.f472676h;
                if (set != null) {
                    java.util.HashSet hashSet = (java.util.HashSet) set;
                    if (hashSet.size() != 0) {
                        java.util.Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((c01.r8) it.next()).a(str, createTime);
                        }
                    }
                }
                boolean z17 = com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.f172439m;
                java.util.List list = com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.f172438i;
                if (z17) {
                    ((java.util.ArrayList) list).add(str);
                } else {
                    ((java.util.ArrayList) list).clear();
                    com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.f172439m = true;
                    if (c01.d9.e().f70771n) {
                        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.class);
                        intent.putExtra("_RemindDialog_User", Q0);
                        intent.putExtra("_RemindDialog_Remind", str);
                        intent.setFlags(603979776);
                        intent.addFlags(268435456);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else {
                        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.subapp.ui.voicereminder.RemindDialog.class);
                        intent2.putExtra("_RemindDialog_User", Q0);
                        intent2.putExtra("_RemindDialog_Remind", str);
                        intent2.setFlags(604012544);
                        intent2.addFlags(268435456);
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(context, "com/tencent/mm/plugin/subapp/ui/voicereminder/RemindDialog", "show", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
            }
        }
        return false;
    }
}
