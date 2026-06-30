package kq3;

/* loaded from: classes12.dex */
public class g implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        double[] c17;
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() > 1) {
            return false;
        }
        if (strArr.length < 2) {
            return true;
        }
        java.lang.String str2 = strArr[1];
        str2.getClass();
        char c18 = 65535;
        switch (str2.hashCode()) {
            case -1796087539:
                if (str2.equals("printrate")) {
                    c18 = 0;
                    break;
                }
                break;
            case -1424659792:
                if (str2.equals("enabledebug")) {
                    c18 = 1;
                    break;
                }
                break;
            case -1354714445:
                if (str2.equals("copydb")) {
                    c18 = 2;
                    break;
                }
                break;
            case 66125101:
                if (str2.equals("outlimit")) {
                    c18 = 3;
                    break;
                }
                break;
            case 819712873:
                if (str2.equals("deletedb")) {
                    c18 = 4;
                    break;
                }
                break;
        }
        try {
            switch (c18) {
                case 0:
                    if (strArr.length > 2 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
                        nVar.m134976x2690a4ac();
                        double[] c19 = nVar.f347065q.c(str, strArr[2]);
                        java.lang.String str3 = strArr[2];
                        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                        java.lang.String str4 = strArr[2];
                        ((sg3.a) v0Var).getClass();
                        java.lang.String format = java.lang.String.format("%s\n%s\n DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f", str3, c01.a2.e(str4), java.lang.Double.valueOf(c19[0]), java.lang.Double.valueOf(c19[1]), java.lang.Double.valueOf(c19[2]));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityCommand", "printrate %s", format);
                        b(context, format);
                        break;
                    } else {
                        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
                        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str)) {
                            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar2.m134976x2690a4ac();
                            c17 = nVar2.f347065q.c(str, "@all");
                            fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar3.m134976x2690a4ac();
                            com.p314xaae8f345.mm.p1006xc5476f33.p1949xba8879a4.p1950x633fb29.c2c.img.f fVar = nVar3.f347065q;
                            fVar.getClass();
                            android.database.Cursor h17 = fVar.f401989a.h(java.lang.String.format("SELECT *, max(monthreceivecount) FROM %s WHERE chat = ? AND talker <> '%s' GROUP BY chat, talker;", "C2CMsgImgUsage", "@all"), new java.lang.String[]{str});
                            java.util.ArrayList arrayList = new java.util.ArrayList(10);
                            while (h17.moveToNext()) {
                                arrayList.add(fVar.b(h17));
                            }
                            h17.close();
                            java.util.Collections.sort(arrayList, new lq3.a(fVar));
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                r45.rr5 rr5Var = (r45.rr5) it.next();
                                stringBuffer.append("\n");
                                tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                                java.lang.String str5 = rr5Var.f466676e;
                                ((sg3.a) v0Var2).getClass();
                                stringBuffer.append(c01.a2.e(str5));
                                stringBuffer.append("[");
                                stringBuffer.append(rr5Var.f466676e);
                                stringBuffer.append("][");
                                stringBuffer.append(k35.m1.d("yyyy-MM-dd", rr5Var.f466677f / 1000));
                                stringBuffer.append("]");
                                stringBuffer.append(java.lang.String.format("%.2f %.2f %.2f %d", java.lang.Float.valueOf(rr5Var.f466684p), java.lang.Float.valueOf(rr5Var.f466685q), java.lang.Float.valueOf(rr5Var.f466686r), java.lang.Integer.valueOf(rr5Var.f466682n)));
                            }
                        } else {
                            fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
                            nVar4.m134976x2690a4ac();
                            c17 = nVar4.f347065q.c(str, str);
                        }
                        java.lang.String format2 = java.lang.String.format("DayClickRate: %.2f\nWeekClickRate: %.2f\nMonthClickRate: %.2f%s", java.lang.Double.valueOf(c17[0]), java.lang.Double.valueOf(c17[1]), java.lang.Double.valueOf(c17[2]), stringBuffer.toString());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityCommand", "printrate %s", format2);
                        b(context, format2);
                        break;
                    }
                    break;
                case 1:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityCommand", "enabledebug %s", strArr[2]);
                    strArr[2].equals("1");
                    break;
                case 2:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityCommand", "copydb");
                    gm0.j1.i();
                    java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "MicroMsgPriority.db").o();
                    com.p314xaae8f345.mm.vfs.w6.h("/sdcard/tencent/MicroMsg/Download/priority.db");
                    com.p314xaae8f345.mm.vfs.w6.c(o17, "/sdcard/tencent/MicroMsg/Download/priority.db");
                    break;
                case 3:
                    long longValue = java.lang.Long.valueOf(strArr[2]).longValue();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityCommand", "currentCount %d", java.lang.Long.valueOf(longValue));
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTOGETBIG_IMG_CURRENT_LONG, java.lang.Long.valueOf(longValue));
                    break;
                case 4:
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.PriorityCommand", "deletedb");
                    gm0.j1.i();
                    com.p314xaae8f345.mm.vfs.w6.h(new com.p314xaae8f345.mm.vfs.r6(gm0.j1.u().h(), "MicroMsgPriority.db").o());
                    int myPid = android.os.Process.myPid();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(myPid));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(obj, arrayList2.toArray(), "com/tencent/mm/plugin/priority/model/PriorityCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    android.os.Process.killProcess(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(obj, "com/tencent/mm/plugin/priority/model/PriorityCommand", "processCommand", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;)Z", "android/os/Process_EXEC_", "killProcess", "(I)V");
                    break;
            }
        } catch (java.lang.Exception unused) {
        }
        return true;
    }

    public final void b(android.content.Context context, java.lang.String str) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(str);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
    }
}
